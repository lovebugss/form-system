package com.example.form.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.pojo.entity.Form;
import com.example.form.pojo.entity.FormData;
import com.example.form.enums.FormType;
import com.example.form.exception.BizException;
import com.example.form.mapper.FormDataMapper;
import com.example.form.pojo.req.SubmitFormDataRequest;
import com.example.form.pojo.vo.SubmitFormDataVo;
import com.example.form.result.ErrorCode;
import com.example.form.service.FormDataService;
import com.example.form.service.FormService;
import com.example.form.service.form.FormHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

/**
 * 表单数据;(form_data)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
@RequiredArgsConstructor
public class FormDataServiceImpl extends ServiceImpl<FormDataMapper, FormData> implements FormDataService {

    private final FormService formService;
    private final ObjectProvider<FormHandler> formHandlerObjectProvider;

    @Override
    public SubmitFormDataVo submit(SubmitFormDataRequest request) {

        // 检查表单是否存在
        Form form = formService.checkFormStatus(request.getFormId());
        // 根据表单类型, 查找对应的表单数据处理器
        FormHandler formHandler = getFormHandler(form.getType());
        // 根据表单数据处理器, 处理表单数据
        return formHandler.submit(request.getFormData(), form);
    }

    private FormHandler getFormHandler(FormType type) {
        return formHandlerObjectProvider.stream()
                .filter(formHandler -> formHandler.match(type))
                .findFirst()
                .orElseThrow(() -> new BizException(ErrorCode.FORM_HANDLER_NOT_FOUND));
    }
}
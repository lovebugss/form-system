package com.example.form.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.Form;
import com.example.form.enums.FormStatus;
import com.example.form.exception.BizException;
import com.example.form.mapper.FormMapper;
import com.example.form.result.ErrorCode;
import com.example.form.service.FormService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * 表单;(form)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormServiceImpl extends ServiceImpl<FormMapper, Form> implements FormService {
    @Override
    public Form checkFormStatus(String formId) {
        // 检查表单是否存在
        Form form = this.getById(formId);
        if (form == null) {
            throw new BizException(ErrorCode.FORM_NOT_EXIST);
        }
        // 检查表单是否已经发布
        if (!FormStatus.EXPIRED.equals(form.getStatus())) {
            // 当前表单尚未发布
            throw new BizException(ErrorCode.FORM_NOT_EXIST);
        }
        // 检查表单是否已经过期
        if (form.getEndTime().isBefore(LocalDateTime.now())) {
            // 当前表单已经过期
            throw new BizException(ErrorCode.FORM_NOT_EXIST);
        }
        // ....

        return form;
    }
}
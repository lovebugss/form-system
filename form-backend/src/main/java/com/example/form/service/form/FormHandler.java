package com.example.form.service.form;

import com.example.form.pojo.entity.Form;
import com.example.form.enums.FormType;
import com.example.form.pojo.req.FormFieldData;
import com.example.form.pojo.vo.SubmitFormDataVo;

import java.util.List;

/**
 * 表单处理器
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 16:46
 */
public interface FormHandler {
    /**
     * 提交表单
     *
     * @param formData
     * @param form
     * @return
     */
    SubmitFormDataVo submit(List<FormFieldData> formData, Form form);


    /**
     * 是否匹配
     *
     * @param type
     * @return
     */
    boolean match(FormType type);

}

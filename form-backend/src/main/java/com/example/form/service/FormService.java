package com.example.form.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.form.entity.Form;

/**
 * - 表单;(form)表服务接口
 * - @author : <a [href="mailto:r979668507@gmail.com](mailto:href=%22mailto:r979668507@gmail.com)">renjp</a>
 * - @date: 2023-7-9
 */
public interface FormService extends IService<Form> {


    /**
     * 检查表单状态
     * 1. 表单是否存在
     * 2. 表单是否已经发布
     * 3. 表单是否已经过期
     *
     * @param formId
     */
    Form checkFormStatus(String formId);
}
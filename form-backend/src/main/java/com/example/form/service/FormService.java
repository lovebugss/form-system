package com.example.form.service;

import com.example.form.pojo.entity.Form;
import com.example.form.pojo.dto.CreateFormDTO;

/**
 * - 表单;(form)表服务接口
 * - @author : <a [href="mailto:r979668507@gmail.com](mailto:href=%22mailto:r979668507@gmail.com)">renjp</a>
 * - @date: 2023-7-9
 */
public interface FormService {


    /**
     * 检查表单状态
     * 1. 表单是否存在
     * 2. 表单是否已经发布
     * 3. 表单是否已经过期
     *
     * @param formId
     */
    Form checkFormStatus(String formId);

    /**
     * 创建表单
     *
     * @param parse
     */
    void create(CreateFormDTO parse);
}
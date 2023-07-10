package com.example.form.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.form.entity.FormField;

import java.util.List;

/**
 * - 表单字段;(form_fields)表服务接口
 * - @author : <a [href="mailto:r979668507@gmail.com](mailto:href=%22mailto:r979668507@gmail.com)">renjp</a>
 * - @date: 2023-7-9
 */
public interface FormFieldService extends IService<FormField> {


    /**
     * 根据表单ID 获取表单下所有的字段
     * @param id
     * @return
     */
    List<FormField> getFormFields(Integer id);
}
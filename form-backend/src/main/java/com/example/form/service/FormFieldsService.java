package com.example.form.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.form.entity.FormFields;

import java.util.List;

/**
 * - 表单字段;(form_fields)表服务接口
 * - @author : <a [href="mailto:r979668507@gmail.com](mailto:href=%22mailto:r979668507@gmail.com)">renjp</a>
 * - @date: 2023-7-9
 */
public interface FormFieldsService extends IService<FormFields> {


    /**
     * 根据表单ID 获取表单下所有的字段
     * @param id
     * @return
     */
    List<FormFields> getFormFields(Integer id);
}
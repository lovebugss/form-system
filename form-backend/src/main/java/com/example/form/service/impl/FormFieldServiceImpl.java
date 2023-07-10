package com.example.form.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormField;
import com.example.form.mapper.FormFieldMapper;
import com.example.form.service.FormFieldService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 表单字段;(form_fields)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormFieldServiceImpl extends ServiceImpl<FormFieldMapper, FormField> implements FormFieldService {
    @Override
    public List<FormField> getFormFields(Integer id) {
        return null;
    }
}
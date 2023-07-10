package com.example.form.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormFieldTypes;
import com.example.form.mapper.FormFieldTypesMapper;
import com.example.form.service.FormFieldTypeService;
import org.springframework.stereotype.Service;

/**
 * 表单字段类型;(form_field_types)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormFieldTypeServiceImpl extends ServiceImpl<FormFieldTypesMapper, FormFieldTypes> implements FormFieldTypeService {

}
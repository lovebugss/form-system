package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormFields;
import com.example.form.mapper.FormFieldsMapper;
import com.example.form.service.FormFieldsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 表单字段;(form_fields)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormFieldsServiceImpl extends ServiceImpl<FormFieldsMapper, FormFields> implements FormFieldsService {
    @Override
    public List<FormFields> getFormFields(Integer id) {
        return null;
    }
}
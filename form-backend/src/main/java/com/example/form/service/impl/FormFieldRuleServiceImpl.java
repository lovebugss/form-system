package com.example.form.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormFieldRule;
import com.example.form.mapper.FormFieldRuleMapper;
import com.example.form.service.FormFieldRuleService;
import org.springframework.stereotype.Service;

/**
 * 字段规则;(form_field_rule)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormFieldRuleServiceImpl extends ServiceImpl<FormFieldRuleMapper, FormFieldRule> implements FormFieldRuleService {


}
package com.example.form.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.form.entity.FormFieldLogic;
import com.example.form.mapper.FormFieldLogicMapper;
import com.example.form.service.FormFieldLogicService;
import org.springframework.stereotype.Service;

/**
 * 字段逻辑;(form_field_logic)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Service
public class FormFieldLogicServiceImpl extends ServiceImpl<FormFieldLogicMapper, FormFieldLogic> implements FormFieldLogicService {

}
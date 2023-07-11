package com.example.form.service.impl;

import com.example.form.pojo.entity.Form;
import com.example.form.enums.FormStatus;
import com.example.form.exception.BizException;
import com.example.form.mapper.FormMapper;
import com.example.form.pojo.dto.CreateFormDTO;
import com.example.form.result.ErrorCode;
import com.example.form.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * 表单;(form)表服务实现类
 *
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class FormServiceImpl implements FormService {

    private final FormMapper formMapper;

    private final FormFieldService formFieldService;

    private final FormFieldLogicService formFieldLogicService;

    private final FormFieldRuleService formFieldRuleService;

    @Override
    public Form checkFormStatus(String formId) {
        log.info("检查表单状态, formId:{}", formId);
        // 检查表单是否存在
        Form form = formMapper.selectById(formId);
        if (form == null) {
            throw new BizException(ErrorCode.FORM_NOT_EXIST);
        }
        // 检查表单是否已经发布
        if (!FormStatus.EXPIRED.equals(form.getStatus())) {
            // 当前表单尚未发布
            throw new BizException(ErrorCode.FORM_NOT_EXIST);
        }
        // 检查表单是否已经过期
        if (form.getEndTime().isBefore(LocalDateTime.now())) {
            // 当前表单已经过期
            throw new BizException(ErrorCode.FORM_NOT_EXIST);
        }
        // ....其他状态检查

        return form;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(CreateFormDTO parse) {
        log.info("创建表单, form:{}", parse);
        // 创建表单
        formMapper.insert(parse.getForm());
        // 创建表单字段
        formFieldService.saveBatch(parse.getFormFields());
        // 保存表单字段逻辑
        formFieldLogicService.saveBatch(parse.getFormFieldLogics());
        // 保存表单字段规则
        formFieldRuleService.saveBatch(parse.getFormFieldRules());

    }
}
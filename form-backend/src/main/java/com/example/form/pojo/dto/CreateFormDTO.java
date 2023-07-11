package com.example.form.pojo.dto;

import com.example.form.pojo.entity.Form;
import com.example.form.pojo.entity.FormField;
import com.example.form.pojo.entity.FormFieldLogic;
import com.example.form.pojo.entity.FormFieldRule;
import lombok.Data;

import java.util.List;

/**
 * @author r9796
 */
@Data
public class CreateFormDTO {

    // 表单属性
    private Form form;
    // 表单字段

    List<FormField> formFields;
    // 表单字段逻辑

    List<FormFieldLogic> formFieldLogics;
    // 表单字段规则

    List<FormFieldRule> formFieldRules;
}

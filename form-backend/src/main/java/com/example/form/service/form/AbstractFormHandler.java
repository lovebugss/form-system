package com.example.form.service.form;

import com.example.form.entity.Form;
import com.example.form.entity.FormFields;
import com.example.form.enums.FieldType;
import com.example.form.pojo.req.FormFieldData;
import com.example.form.pojo.vo.SubmitFormDataVo;
import com.example.form.service.FormFieldsService;
import com.example.form.service.form.check.FormFieldChecker;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 抽象表单处理器, 定义了表单处理器的基本流程(模版模式)
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 17:33
 */
@Slf4j
public abstract class AbstractFormHandler implements FormHandler {
    protected AbstractFormHandler(FormFieldsService formFieldsService, List<FormFieldChecker> formFieldCheckers) {
        this.formFieldsService = formFieldsService;
        this.formFieldCheckerMap = formFieldCheckers
                .stream()
                .collect(Collectors.toMap(FormFieldChecker::supportType, Function.identity()));
    }

    protected final FormFieldsService formFieldsService;
    protected Map<FieldType, FormFieldChecker> formFieldCheckerMap;


    public void checkField(List<FormFields> formFields, List<FormFieldData> formData) {
        Map<String, FormFieldData> requestMap = formData
                .stream()
                .collect(Collectors.toMap(FormFieldData::getFieldKey, Function.identity()));

        for (FormFields formField : formFields) {
            // 根据表单字段类型, 获取对应的表单字段处理器
            FieldType fieldType = formField.getFieldType();
            formFieldCheckerMap.get(fieldType)
                    .check(formField, requestMap.get(formField.getFormKey()));
            // 根据表单字段处理器, 处理表单字段
        }
    }

    @Override
    public SubmitFormDataVo submit(List<FormFieldData> formData, Form form) {

        List<FormFields> formFields = formFieldsService.getFormFields(form.getId());
        // 检查字段类型
        checkField(formFields, formData);

        // 自动计算
        formData = autoCalculate(formFields, formData);
        // 保存表单数据
        saveFormData(form.getId(), formData);


        return responseWrapper(form, formFields, formData);
    }

    /**
     * 保存数据
     *
     * @param formId 表单ID
     * @param formData 表单数据
     */
    protected abstract void saveFormData(Integer formId, List<FormFieldData> formData);

    /**
     * 自动计算
     * @param formFields
     * @param formData
     * @return
     */
    protected List<FormFieldData> autoCalculate(List<FormFields> formFields, List<FormFieldData> formData) {
        return formData;
    }

    /**
     * 响应包装
     * @param form
     * @param formFields
     * @param formData
     * @return
     */
    protected abstract SubmitFormDataVo responseWrapper(Form form, List<FormFields> formFields, List<FormFieldData> formData);
}

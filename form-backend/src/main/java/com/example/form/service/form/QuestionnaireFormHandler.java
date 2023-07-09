package com.example.form.service.form;

import com.example.form.entity.Form;
import com.example.form.entity.FormFields;
import com.example.form.enums.FormType;
import com.example.form.pojo.req.FormFieldData;
import com.example.form.pojo.vo.SubmitFormDataVo;
import com.example.form.service.FormFieldsService;
import com.example.form.service.form.check.FormFieldChecker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 问卷表单处理器
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 16:58
 */
@Service
@Slf4j
public class QuestionnaireFormHandler extends AbstractFormHandler {

    public QuestionnaireFormHandler(FormFieldsService formFieldsService, List<FormFieldChecker> formFieldCheckers) {
        super(formFieldsService, formFieldCheckers);
    }

    @Override
    protected void saveFormData(Integer formId, List<FormFieldData> formData) {

    }

    @Override
    protected SubmitFormDataVo responseWrapper(Form form, List<FormFields> formFields, List<FormFieldData> formData) {
        return null;
    }


    @Override
    public boolean match(FormType type) {
        return FormType.QUESTIONNAIRE.equals(type);
    }
}

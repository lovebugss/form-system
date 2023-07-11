package com.example.form.pojo.dto;

import com.example.form.pojo.req.FormFieldData;
import lombok.Data;

import java.util.List;

@Data
public class SubmitFormDataDTO {
    private String formId;
    private List<FormFieldData> formData;
}

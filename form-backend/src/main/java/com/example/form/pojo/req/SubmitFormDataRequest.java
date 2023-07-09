package com.example.form.pojo.req;

import lombok.Data;

import java.util.List;

/**
 * 提交表单请求实体
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 16:20
 */
@Data
public class SubmitFormDataRequest {
    private String formId;

    private List<FormFieldData> formData;
}

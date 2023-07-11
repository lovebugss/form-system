package com.example.form.service.form.check;

import com.example.form.pojo.entity.FormField;
import com.example.form.enums.FieldType;
import com.example.form.pojo.req.FormFieldData;

/**
 * 字段检查器
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 17:19
 */
public interface FormFieldChecker {
    void check(FormField formField, FormFieldData formFieldData);

    FieldType supportType();
}

package com.example.form.service.form.check;

import com.example.form.pojo.entity.FormField;
import com.example.form.enums.FieldType;
import com.example.form.exception.BizException;
import com.example.form.pojo.req.FormFieldData;
import com.example.form.result.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 文本字段检查器
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 17:46
 */
@Slf4j
@Service
public class TextFieldChecker implements FormFieldChecker {
    @Override
    public void check(FormField formField, FormFieldData formFieldData) {
        log.info("检查文本字段, field: {}, data: {}", formField, formFieldData);
        // 检查字段是否为空
        String data = formFieldData.getData();
        if (data == null) {
            if (formField.isRequired()) {
                throw new BizException(ErrorCode.PARAM_ERROR);
            }
        } else {
            // TODO 其他检查
        }
    }

    @Override
    public FieldType supportType() {
        return FieldType.TEXT;
    }
}

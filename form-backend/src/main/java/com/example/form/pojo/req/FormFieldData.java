package com.example.form.pojo.req;

import lombok.Data;

/**
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 16:21
 */
@Data
public class FormFieldData {
    private String fieldKey;
    private Integer versionId;
    private String data;
}

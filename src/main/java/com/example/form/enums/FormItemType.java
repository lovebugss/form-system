package com.example.form.enums;

/**
 * 表单项类型
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/5/16 17:06
 */
public enum FormItemType {
    TEXT("文本"),
    SELECT("下拉菜单"),
    RADIO("单选框"),
    CHECKBOX("多选框"),
    NUMBER("数字"),
    IMAGE("图片"),
    VIDEO("视频"),
    EMAIL("邮件"),
    FILE("文件");

    private String desc;

    FormItemType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}

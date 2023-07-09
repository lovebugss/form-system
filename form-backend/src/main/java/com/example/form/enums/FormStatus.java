package com.example.form.enums;

/**
 * TODO
 *
 * @author <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date 2023/7/9 16:33
 */
public enum FormStatus {
    // 草稿
    DRAFT(0),
    // 已发布
    PUBLISHED(1),
    // 已过期
    EXPIRED(2);

    private final int status;

    FormStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}

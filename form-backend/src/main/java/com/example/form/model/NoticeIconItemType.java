package com.example.form.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 已读未读列表的枚举
 */
public enum NoticeIconItemType {
    NOTIFICATION("notification"),
    MESSAGE("message"),
    EVENT("event");

    private String value;

    NoticeIconItemType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static NoticeIconItemType fromValue(String text) {
        for (NoticeIconItemType b : NoticeIconItemType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}

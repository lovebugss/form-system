package com.example.form.service.item;

import com.example.form.enums.FormItemType;

public class TextValidator implements FormItemValidator<String> {
    @Override
    public boolean match(FormItemType type) {
        return FormItemType.TEXT.equals(type);
    }

    @Override
    public boolean valid(String data) {
        return false;
    }
}

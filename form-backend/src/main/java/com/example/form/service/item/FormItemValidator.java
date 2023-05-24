package com.example.form.service.item;

import com.example.form.enums.FormItemType;

public interface FormItemValidator<T> {

    boolean match(FormItemType type);

    boolean valid(T data);

}

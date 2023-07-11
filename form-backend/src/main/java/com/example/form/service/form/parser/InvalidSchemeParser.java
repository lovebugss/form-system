package com.example.form.service.form.parser;

import com.example.form.exception.BizException;
import com.example.form.pojo.dto.CreateFormDTO;
import com.example.form.result.ErrorCode;


public class InvalidSchemeParser implements FormDesignerSchemeParser {
    @Override
    public CreateFormDTO parse(String scheme) {
        throw new BizException(ErrorCode.INVALID_FORM_SCHEME_TYPE);
    }

    @Override
    public FormSchemeType schemeType() {
        return null;
    }

}

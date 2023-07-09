package com.example.form.exception;


import com.example.form.result.ErrorCode;

/**
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
public class BizException extends RuntimeException {
    private final int code;

    public BizException(ErrorCode code) {
        super(code.getMessage());
        this.code = code.getCode();

    }

    public int getCode() {
        return code;
    }
}
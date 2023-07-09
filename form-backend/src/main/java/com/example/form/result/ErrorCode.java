package com.example.form.result;


/**
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
public enum ErrorCode {
    ERROR(500, "系统内部错误, 请联系管理员"),
    PARAM_ERROR(422, "参数错误"),
    FORM_NOT_EXIST(40004, "表单不存在"), FORM_HANDLER_NOT_FOUND(50004, "表单处理器不存在");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
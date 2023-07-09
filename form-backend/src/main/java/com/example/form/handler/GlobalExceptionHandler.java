package com.example.form.handler;

import com.example.form.exception.BizException;
import com.example.form.result.ErrorCode;
import com.example.form.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author : <a href="mailto:r979668507@gmail.com">renjp</a>
 * @date : 2023-7-9
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 所有Exception
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<Void> handlerException(Exception exception) {
        logger.error("exception", exception);
        return Result.error(ErrorCode.ERROR);
    }

    /**
     * 自定义业务异常处理
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    public Result<Void> handlerBizException(BizException exception) {
        logger.warn("biz-exception: " + exception.getMessage());
        return Result.error(exception.getCode(), exception.getMessage());
    }
}
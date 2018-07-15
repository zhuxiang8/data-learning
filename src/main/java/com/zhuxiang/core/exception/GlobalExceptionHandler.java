package com.zhuxiang.core.exception;

import com.zhuxiang.common.base.controller.response.AbstractResponse;
import com.zhuxiang.common.base.controller.response.DataResponse;
import com.zhuxiang.common.base.controller.response.ObjectResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 全局异常处理
 * @Author zhuxiang
 * @Date 2018/4/3 9:43
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 数据校验异常捕获
     *
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public AbstractResponse validExceptionHandler(HttpServletRequest request, MethodArgumentNotValidException exception) {
        List<FieldError> errors = exception.getBindingResult().getFieldErrors();
        //封装msg
        StringBuffer errorMsg = new StringBuffer();
        //按需重新封装需要返回的错误信息
        List<ArgumentInvalidResult> invalidArguments = new ArrayList<>();
        errors.stream().forEach(e -> {
            errorMsg.append(e.getDefaultMessage()).append(";");
            ArgumentInvalidResult invalidArgument = new ArgumentInvalidResult();
            invalidArgument.setDefaultMessage(e.getDefaultMessage());
            invalidArgument.setField(e.getField());
            invalidArgument.setRejectedValue(e.getRejectedValue());
            invalidArguments.add(invalidArgument);
        });
        log.error("数据校验异常,URL请求={},常信息={}", request.getRequestURL(), invalidArguments);
        log.error("数据校验异常,异常详情={}", exception.getBindingResult());
        return DataResponse.getInstance().fail(errorMsg.toString(), invalidArguments);
    }

    /**
     * 通用业务异常捕获处理
     *
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public AbstractResponse allExceptionHandler(HttpServletRequest request, Exception exception) {
        if (exception instanceof BusinessException) {
            log.error("业务处理异常,异常详情={}", exception.getMessage());
            return ObjectResponse.getInstance().fail(exception.getMessage());
        } else if (exception instanceof SQLException) {
            log.error("数据库处理异常,异常详情={}", exception.getMessage());
            return ObjectResponse.getInstance().fail("数据库异常");
        } else {
            log.error("其他处理异常,异常详情={}", exception.getMessage(), exception);
            return ObjectResponse.getInstance().fail("服务器异常");
        }
    }
}

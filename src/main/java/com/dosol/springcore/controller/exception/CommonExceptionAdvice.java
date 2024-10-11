package com.dosol.springcore.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {
    @ResponseBody
    //이게 브라우저 바디에 넣는다는거임
    //웹 브라우저 바디에 바로 리턴해서 보여주는거임. 그니까 따로 jsp파일이 없어도 되는거임
    @ExceptionHandler(NumberFormatException.class)
    public String exceptionNumberFormat(NumberFormatException e) {
        log.error("-----------------------------");
        log.error(e.getMessage());
        return "Number Format Exception";
    }
}

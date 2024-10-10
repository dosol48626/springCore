package com.dosol.springcore.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(){
//    public String hello(){
        log.info("hello");
//        return "hello"; ///WEB-INF/views/hello.jsp 를 만들어줌. 리턴으로 헬로를 주는거지.
    }
}

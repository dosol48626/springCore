package com.dosol.springcore.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(){
//    public String hello(){
        log.info("hello");
//        return "hello"; ///WEB-INF/views/hello.jsp 를 만들어줌. 리턴으로 헬로를 주는거지.
    }

    @GetMapping("/ex1")
    public void ex1(@RequestParam("name") String name,
                    @RequestParam("age") int age,
                    @RequestParam("gender") String gender) {
        log.info("ex1");
        log.info(name);
        log.info(age);
        log.info(gender);
    }

    @GetMapping("/ex2/{name}")
    public void ex2(@PathVariable("name") String name){
        log.info("ex2");
        log.info(name);
    }

    @GetMapping("/ex3")
    public void ex3(@RequestParam("dueDate") LocalDate dueDate){
        log.info("ex3");
        log.info(dueDate);
    }
}
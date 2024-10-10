package com.dosol.springcore.controller;

import com.dosol.springcore.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Log4j2
@Controller
@RequestMapping("/todo")
public class TodoController {

//    locolhost:8080/todo/list 이렇게 요청되는거임 (밑에꺼가)
    //@RequestMapping(value = "/list", method = RequestMethod.GET)
//    이런방식이 있었다 하고 테스트해본거임 ㅇㅇ 밑에꺼도 같은 맥락
    @GetMapping("/list")
    public void list(){
        log.info("list");
    }

    //@RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void registerGet(){
        log.info("registerGet");
    }

    //@RequestMapping(value = "/register", method = RequestMethod.POST)
    @PostMapping("/register")
    public String registerpost(TodoDTO todoDTO, Model model){
        log.info("registerPost");
        model.addAttribute("dto", todoDTO);
        return "/todo/list";
    }
}
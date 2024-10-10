package com.dosol.springcore.controller;

import com.dosol.springcore.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String registerpost(@ModelAttribute TodoDTO todoDTO, Model model){
        //@MOdel 뭐시기가 저 어노테이션에 DTO담아서 전달한다 이뜻임.
        log.info("registerPost");
//        model.addAttribute("dto", todoDTO);
//          이거 쓰고 싶으면 list.jsp에서 바꿔주면 된다
        return "redirect:/todo/list";
//        redirect 이게 뭔가하면 jsp파일을 찾는게 아니고 /todo/list라는 컨트롤러를 찾으러감.
        //다시 값 없는 상태로 가서 아무것도 값이 없이 간다.
    }
}
package com.bwj.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // 웹 어플리케이션에서 /hello 라고 들어오면 이 메서드를 호출해준다.
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "Hello");
        return "hello";

    }
}

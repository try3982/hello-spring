package com.bwj.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // 웹 어플리케이션에서 /hello 라고 들어오면 이 메서드를 호출해준다.
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "Hello");
        return "hello";

    }
    @GetMapping("hello-string")
    @ResponseBody // http에서 body에 데이터를 직접 넣어주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;

    }
    static class Hello {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}

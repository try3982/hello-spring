package com.bwj.hellospring.controller;

import com.bwj.hellospring.domain.Member;
import org.springframework.web.bind.annotation.PostMapping;

public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

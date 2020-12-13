package com.junping.crm.settings.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/settings/user")
public class UserController {

    @RequestMapping(value = "/test.do")
    public void test(){
        System.out.println("hello crm");
    }

}

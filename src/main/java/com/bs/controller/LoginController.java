package com.bs.controller;

import com.bs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("")
public class LoginController {
    @Autowired
    private LoginService loginService;
    //跳转页面
    @RequestMapping("/login")
    public String JumpPage(){
        return "login";
    }
}

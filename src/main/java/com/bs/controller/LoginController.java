package com.bs.controller;

import com.bs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("")
public class LoginController {
    List<Map> content = new ArrayList<Map>();
    @Autowired
    private LoginService loginService;
    //登录
    @PostMapping("/judge")
    @ResponseBody
    public Object judge(@RequestParam Map paramMap){
        //System.out.println(paramMap);
        int code = 0;
        String msg = "登录成功";
        Map mapModel = new HashMap();
        try{
            int cou = loginService.judge(paramMap);
            if (cou==1){
                code = 1;
                mapModel.put("url","manage");
                content = loginService.findAllUser(paramMap);
            }else{
                code = -1;
                msg = "账号或密码错误请重新输入";
            }
        }catch (Exception e){
            code = -1;
            msg = "数据异常";
            e.printStackTrace();
        }
        mapModel.put("code",code);
        mapModel.put("msg",msg);
        return mapModel;
    }
    //跳转页面
    @RequestMapping("/login")
    public String JumpPageLogin(){
        return "login";
    }
    //跳转页面
    @RequestMapping("/manage")
    public String JumPageManage(Model model){
        Map paramMap = new HashMap();
        List<Map> list = content;
        for (Map map : list){
            for (Object k : map.keySet()){
                paramMap.put(k,map.get(k));
            }
        }
        //System.out.println(paramMap);
        List<Map> resultList = loginService.findAll(paramMap);
        model.addAttribute("resultList",resultList);
        return "manage";
    }
}

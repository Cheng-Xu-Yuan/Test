package com.bs.controller;

import com.bs.entity.User;
import com.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zzf
 * @description
 * @create: 2021-03-16 08:27
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public String findAll(Model model){
        List<Map> userAll = userService.findUserAll();
        model.addAttribute("resultList",userAll);
        return "user";
    }

}

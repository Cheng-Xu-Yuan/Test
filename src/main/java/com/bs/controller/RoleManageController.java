package com.bs.controller;

import com.bs.service.RoleManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/xtgl")
public class RoleManageController {
    @Autowired
    private RoleManageService roleManageService;
    //查询所有角色
    @RequestMapping("/findallrole")
    @ResponseBody
    public Object findAllRole(@RequestParam Map paramMap){
        int code = 0;
        String msg = "查询成功";
        Map mapModel = new HashMap();
        try{
            List<Map> list = roleManageService.findAllRole(paramMap);
            mapModel.put("list",list);
        }catch (Exception e){
            code = -1;
            msg = "操作异常";
            e.printStackTrace();
        }
        mapModel.put("code",code);
        mapModel.put("msg",msg);
        return mapModel;
    }
    //添加或修改角色
    @PostMapping("/addorupdate")
    @ResponseBody
    public Object addOrUpdate(@RequestParam Map paramMap){
        int code = 0;
        String msg = "操作成功";
        Map mapModel = new HashMap();
        try{
            roleManageService.addOrUpdate(paramMap);
            if (paramMap.get("role_id")!=""){
                msg = "修改成功";
            }else{
                msg = "添加成功";
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
    //删除角色
    @PostMapping("/del")
    @ResponseBody
    public Object del(@RequestParam Map paramMap){
        int code = 0;
        String msg = "删除成功";
        Map mapModel = new HashMap();
        try{
            roleManageService.del(paramMap);
        }catch (Exception e){
            code = -1;
            msg = "数据异常";
            e.printStackTrace();
        }
        mapModel.put("code",code);
        mapModel.put("msg",msg);
        return mapModel;
    }
}

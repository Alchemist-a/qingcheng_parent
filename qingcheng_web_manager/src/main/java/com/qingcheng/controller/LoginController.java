package com.qingcheng.controller;

import com.qingcheng.entity.PageResult;
import com.qingcheng.entity.Result;
import com.qingcheng.pojo.system.LoginLog;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 炼丹小童子
 * @create 2019-08-06 21:40
 * @name qingcheng_parent - com.qingcheng.controller    Alchemist
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/name")
    public Map showName(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Map map = new HashMap();
        map.put("name",name);
        return map;
    }


}

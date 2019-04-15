package com.ee.upms.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 登录控制器
 * @Author Shane
 * @Date 2019/4/15 20:54
 */

@RestController
public class LoginController {

    @GetMapping("/")
    public Object index(){
        return null;
    }
}

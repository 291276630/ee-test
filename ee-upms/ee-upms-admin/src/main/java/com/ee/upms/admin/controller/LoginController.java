package com.ee.upms.admin.controller;

import com.ee.common.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 登录控制器
 * @Author Shane
 * @Date 2019/4/15 20:54
 */

@RestController
@RequestMapping("login")
public class LoginController extends BaseController {

    @RequestMapping("beforeLogin")
    public Object beforeLogin(){
        return null;
    }

    @RequestMapping("login")
    public Object login(@RequestParam String username, @RequestParam String password, @RequestParam String tempId, @RequestParam String verCode){
        return null;
    }
}

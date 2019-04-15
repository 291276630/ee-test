package com.ee.common.base;

import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 控制器基类
 * @Author Shane
 * @Date 2019/3/31 13:44
 */
public class BaseController {
    private final static Logger log = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler
    public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e){
        log.error("【统一异常处理】：", e);
        request.setAttribute("e", e);
        //shiro没有权限
        if(e instanceof UnauthorizedException){
            return "/403.html";
        }
        //shiro会话过期异常
        if(e instanceof InvalidSessionException){
            return "/error.html";
        }

        return "/error.html";
    }

}

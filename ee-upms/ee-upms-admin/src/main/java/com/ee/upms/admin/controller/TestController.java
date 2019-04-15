package com.ee.upms.admin.controller;

import com.ee.upms.common.upms.dao.UpmsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试控制器
 * @Author Shane
 * @Date 2019/4/12 15:25
 * @Version V1.0
 **/

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private UpmsUserMapper upmsUserMapper;

    @RequestMapping("upmsUser")
    public Object upmsUser(Integer id){
        return upmsUserMapper.selectById(id);
    }

}

package com.ee.upms.common.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ee.upms.common.dao.UpmsUserMapper;
import com.ee.upms.common.model.UpmsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: 测试控制器
 * @Author Shane
 * @Date 2019/4/10 18:56
 * @Version V1.0
 **/

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    UpmsUserMapper upmsUserMapper;

    @RequestMapping("getUser")
    public Object getUser(Integer id){
        QueryWrapper<UpmsUser> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1);
        return upmsUserMapper.selectOne(wrapper);
    }

}

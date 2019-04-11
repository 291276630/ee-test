package com.ee.upms.common.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ee.upms.common.model.UpmsUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UpmsUserMapper extends BaseMapper<UpmsUser> {
    /*int deleteByPrimaryKey(Integer id);

    int insert(UpmsUser record);

    int insertSelective(UpmsUser record);

    UpmsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UpmsUser record);

    int updateByPrimaryKey(UpmsUser record);*/
}
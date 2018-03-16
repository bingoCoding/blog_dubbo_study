package com.bingo.blogserver.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bingo.bloginterface.Entity.SysUserRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserRoleDao extends BaseMapper<SysUserRole> {


    @Select("select role_id from sys_user_role where user_id = #{userId}")
    List<Long> queryRoleIdList(@Param("userId") Long userId);
}

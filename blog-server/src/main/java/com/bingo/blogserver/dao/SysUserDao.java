package com.bingo.blogserver.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bingo.bloginterface.Entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserDao extends BaseMapper<SysUser> {

    /**
     * 查询用户的所有权限
     * @param userId  用户ID
     */
    @Select("select m.perms from sys_user_role ur \n" +
            "\t\t\tLEFT JOIN sys_role_menu rm on ur.role_id = rm.role_id \n" +
            "\t\t\tLEFT JOIN sys_menu m on rm.menu_id = m.menu_id \n" +
            "\t\twhere ur.user_id = #{userId}")
    List<String> queryAllPerms(@Param("userId") Long userId);

    /**
     * 查询用户的所有菜单ID
     */
    @Select("select distinct rm.menu_id from sys_user_role ur \n" +
            "\t\t\tLEFT JOIN sys_role_menu rm on ur.role_id = rm.role_id \n" +
            "\t\twhere ur.user_id = #{userId}")
    List<Long> queryAllMenuId(@Param("userId")Long userId);

}

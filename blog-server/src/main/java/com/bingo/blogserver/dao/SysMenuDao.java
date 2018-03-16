package com.bingo.blogserver.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bingo.bloginterface.Entity.SysMenu;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysMenuDao extends BaseMapper<SysMenu> {

    @Select("select * from sys_menu where parent_id = #{parentId} order by order_num asc ")
    List<SysMenu> queryListParentId(@Param("parentId") Long parentId);
}

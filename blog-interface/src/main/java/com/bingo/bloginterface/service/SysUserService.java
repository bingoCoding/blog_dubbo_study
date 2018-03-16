package com.bingo.bloginterface.service;

import com.baomidou.mybatisplus.service.IService;
import com.bingo.bloginterface.Entity.SysUser;
import com.bingo.bloginterface.pojo.PageUtils;

import java.util.List;
import java.util.Map;

public interface SysUserService extends IService<SysUser> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询用户的所有菜单ID
     */
    List<Long> queryAllMenuId(Long userId);

    List<String> queryAllPerms(Long userId);

}

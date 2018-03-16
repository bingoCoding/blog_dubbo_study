package com.bingo.bloginterface.service;

import com.baomidou.mybatisplus.service.IService;
import com.bingo.bloginterface.Entity.SysUserRole;

import java.util.List;

public interface SysUserRoleService extends IService<SysUserRole> {

    List<Long> queryRoleIdList(Long userId);
}

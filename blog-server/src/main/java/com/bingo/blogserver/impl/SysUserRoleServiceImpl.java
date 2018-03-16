package com.bingo.blogserver.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bingo.bloginterface.Entity.SysUserRole;
import com.bingo.bloginterface.service.SysUserRoleService;
import com.bingo.blogserver.dao.SysUserRoleDao;

import javax.annotation.Resource;
import java.util.List;

@Service(version = "1.0.0")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRole> implements SysUserRoleService {

    @Resource
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public List<Long> queryRoleIdList(Long userId) {
        return baseMapper.queryRoleIdList(userId);
    }
}

package com.bingo.blogserver.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bingo.bloginterface.Entity.SysDept;
import com.bingo.bloginterface.Entity.SysUser;
import com.bingo.bloginterface.pojo.PageUtils;
import com.bingo.bloginterface.service.SysDeptService;
import com.bingo.bloginterface.service.SysUserService;
import com.bingo.blogserver.common.annotation.DataFilter;
import com.bingo.blogserver.common.utils.Constant;
import com.bingo.blogserver.common.utils.Query;
import com.bingo.blogserver.dao.SysUserDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(version = "1.0.0")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    @Autowired
    private SysDeptService sysDeptService;

    @Override
    public List<Long> queryAllMenuId(Long userId) {
        return baseMapper.queryAllMenuId(userId);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String username = (String)params.get("username");

        Page<SysUser> page = this.selectPage(
                new Query<SysUser>(params).getPage(),
                new EntityWrapper<SysUser>()
                        .like(StringUtils.isNotBlank(username),"username", username)
                        .addFilterIfNeed(params.get(Constant.SQL_FILTER) != null, (String)params.get(Constant.SQL_FILTER))
        );

        for(SysUser sysUserEntity : page.getRecords()){
            SysDept sysDept = sysDeptService.selectById(sysUserEntity.getDeptId());
            sysUserEntity.setDeptName(sysDept.getName());
        }

        return new PageUtils(page);
    }

    @Override
    public List<String> queryAllPerms(Long userId) {
        return sysUserDao.queryAllPerms(userId);
    }
}

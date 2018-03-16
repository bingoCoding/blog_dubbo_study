package com.bingo.blogserver.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bingo.bloginterface.Entity.SysDept;
import com.bingo.bloginterface.service.SysDeptService;
import com.bingo.blogserver.dao.SysDeptDao;

import javax.annotation.Resource;

@Service(version = "1.0.0")
public class SysDeptServiceImpl extends ServiceImpl<SysDeptDao, SysDept> implements SysDeptService {

    @Resource
    private SysDeptDao sysDeptDao;


}

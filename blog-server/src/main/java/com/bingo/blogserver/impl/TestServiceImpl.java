package com.bingo.blogserver.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bingo.bloginterface.service.TestService;

@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "test dubbo";
    }
}

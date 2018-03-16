package com.bingo.blogweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bingo.bloginterface.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Reference(version = "1.0.0")
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return testService.test();
    }
}

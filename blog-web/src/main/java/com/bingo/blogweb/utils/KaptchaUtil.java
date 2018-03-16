package com.bingo.blogweb.utils;

import com.bingo.bloginterface.common.RTException;
import com.bingo.blogweb.shiro.ShiroUtils;

public class KaptchaUtil {
    public static String getKaptcha(String key) {
        Object kaptcha = ShiroUtils.getSessionAttribute(key);
        if(kaptcha == null){
            throw new RTException("验证码已失效");
        }
        ShiroUtils.getSession().removeAttribute(key);
        return kaptcha.toString();
    }
}

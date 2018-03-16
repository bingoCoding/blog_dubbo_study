package com.bingo.blogweb.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

public class ShiroUtils {
    /**  加密算法 */
    public final static String hashAlgorithmName = "SHA-256";
    /**  循环次数 */
    public final static int hashIterations = 16;


    public static Session getSession() {
        return SecurityUtils.getSubject().getSession();
    }

    public static org.apache.shiro.subject.Subject getSubject() {
        return SecurityUtils.getSubject();
    }


    public static void setSessionAttribute(Object key, Object value) {
        getSession().setAttribute(key, value);
    }

    public static Object getSessionAttribute(Object key) {
        return getSession().getAttribute(key);
    }
}

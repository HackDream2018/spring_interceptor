package com.demo;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/11
 */
public class AIntercept implements HandlerInterceptor {

    /**
     * 处理器方法被处理器适配器调用前执行
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("into handler method pre1 ...");
        return false;
    }

    /**
     * 处理器方法被处理器适配器调用完后, 视图渲染前执行
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
         System.out.println("xuan ran qian execute1");
    }

    /**
     * 视图渲染后前执行
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("xuan ran hou execute1");
    }
}

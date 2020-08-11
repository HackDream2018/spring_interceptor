package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/11
 */

@Controller
public class SimpleController {

    @RequestMapping("simple")
    public String handlerRequest(HttpServletRequest request, Model model) {
         System.out.println("execute simple handler method");
        return "success";
    }

}

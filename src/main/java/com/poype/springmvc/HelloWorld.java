package com.poype.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    /**
     * 1. 使用 @RequestMapping 注解来映射请求的 URL
     * 2. @ResponseBody 将方法的返回值绑定到 web response body.
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("Hello World of Spring MVC");
        return "Hello World of Spring MVC";
    }
}

package com.poype.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @ResponseBody
    @RequestMapping(path = "/test_method", method = RequestMethod.POST)
    public String testPostMethod() {
        System.out.println("test post method");
        return "testPostMethod";
    }

    @ResponseBody
    @RequestMapping(path = "/test_method", method = RequestMethod.GET)
    public String testGetMethod() {
        System.out.println("test get method");
        return "testGetMethod";
    }
}

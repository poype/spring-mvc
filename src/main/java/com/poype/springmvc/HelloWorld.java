package com.poype.springmvc;

import org.springframework.stereotype.Controller;
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

    /**
     * 使用 param 进行路由，下面的接口要求必须存在参数username，且age参数不能等于10。
     */
    @ResponseBody
    @RequestMapping(path = "/test_param", params = {"username", "age!=10"})
    public String testParams() {
        System.out.println("test params");
        return "testParams";
    }
}

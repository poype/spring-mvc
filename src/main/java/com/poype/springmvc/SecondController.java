package com.poype.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SecondController {

    /**
     * 使用 @PathVariable 将 URI 中的占位符映射到目标方法的参数中
     */
    @ResponseBody
    @RequestMapping("/test_path_variable/{id}/{name}")
    public String testPathVariable(@PathVariable("id") String id, @PathVariable("name") String name) {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        return "testPathVariable";
    }

    /**
     * 使用 @RequestParam 将 URI 中的 param 映射到方法中的参数
     * 默认 @RequestParam 要求参数必须传递，否则抛 MissingServletRequestParameterException
     * 可以通过 required 属性将参数设置为可选类型的。这里的 age 参数就是可选的，可以不传，不传时 age 参数为null
     * 注意这里的 age 参数要用 Integer 类型，不能用 int 类型
     */
    @ResponseBody
    @RequestMapping("/test_request_param")
    public String testRequestParam(@RequestParam("username") String username,
                                   @RequestParam(value = "age", required = false) Integer age) {
        System.out.println("username: " + username);
        System.out.println("age: " + age);
        return "testRequestParam";
    }

    /**
     * 使用 @CookieValue 将 cookie 的值映射给方法的参数
     * 默认情况也是要求对应的 cookie 必须存在，可以用required属性将其设置为可选的
     */
    @ResponseBody
    @RequestMapping("/test_cookie")
    public String testCookieValue(@CookieValue(value = "JSESSIONID", required = false) String sessionId) {
        System.out.println("sessionId: " + sessionId);
        return "testCookieValue";
    }
}

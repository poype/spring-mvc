package com.poype.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}

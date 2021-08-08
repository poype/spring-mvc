package com.poype.springmvc;

import com.poype.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ThirdController {

    /**
     * 被 @ModelAttribute 修饰的方法会在任何 Handler 方法执行前被调用
     * 下面有两个接口，无论哪个接口被调用，都会先调用 @ModelAttribute 方法
     *
     * 在 @ModelAttribute 方法的 map 参数中塞入的对象，能直接赋值给 handler 方法的参数
     * 下面在 modelAttributeMethod 方法的 map 参数中塞入了一个 user 对象，该对象被赋值给两个handler方法的参数
     */
    @ModelAttribute
    public void modelAttributeMethod(Map<String, Object> map) {
        System.out.println("~~~ modelAttributeMethod ~~~");

        User user = new User();
        user.setUsername("Poype");
        user.setAge(22);
        map.put("user", user);
    }

    @ResponseBody
    @RequestMapping("/testModelAttribute1")
    public String testModelAttribute1(User user) {
        System.out.println("testModelAttribute1: " + user);
        return "testModelAttribute1";
    }

    @ResponseBody
    @RequestMapping("/testModelAttribute2")
    public String testModelAttribute2(User user) {
        System.out.println("testModelAttribute2: " + user);
        return "testModelAttribute2";
    }
}

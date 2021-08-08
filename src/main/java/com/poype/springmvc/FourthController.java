package com.poype.springmvc;

import com.poype.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class FourthController {

    @ResponseBody
    @RequestMapping("/testBind1")
    public String testBind1(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("binding fail");
        } else {
            System.out.println("user: " + user);
        }
        return "testBind1";
    }

    @ResponseBody
    @RequestMapping("/testJson")
    public User testJson() {
        User user = new User();
        user.setAge(22);
        user.setUsername("Marco");
        return user;
    }
}

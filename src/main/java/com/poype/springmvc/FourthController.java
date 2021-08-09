package com.poype.springmvc;

import com.poype.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

    @ResponseBody
    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler() {
        int i = 0;
        int result = 10 / i; // throw exception

        return "testExceptionHandler";
    }

    @ResponseBody
    @ExceptionHandler({ArithmeticException.class})
    public String handleArithmeticException(Exception ex, HttpServletRequest request) {
        System.out.println("handle ArithmeticException " + ex);
        System.out.println(request.getParameter("test"));

        return "ArithmeticException is handled";
    }
}

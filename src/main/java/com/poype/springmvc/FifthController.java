package com.poype.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FifthController {

    @ResponseBody
    @RequestMapping("/testExceptionHandler2")
    public String testExceptionHandler2() {
        int i = 0;
        int result = 10 / i; // throw exception

        return "testExceptionHandler2";
    }
}

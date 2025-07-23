package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {

    @GetMapping("/home/main")
    @ResponseBody
    public String ShowMain(){
        return "hi";
    }
}

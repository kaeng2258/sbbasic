package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {
    int i = 0;
    @GetMapping("/home/main")
    @ResponseBody
    public String ShowMain(){
        return "hi";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String ShowMain2(){
        return "bye";
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String ShowMain3(){
        return "sry";
    }
    @GetMapping("/home/increase")
    @ResponseBody
    public int ShowMain4(){
        return i++;
    }
}

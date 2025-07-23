package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/home/plus")
    @ResponseBody
    public int ShowMain5(@RequestParam(value = "a", defaultValue = "0")int a, @RequestParam(value = "b", defaultValue = "0")int b){
        return a+b;
    }
    @GetMapping("/home/calculate")
    @ResponseBody
    public int ShowMain6(@RequestParam(value = "a", defaultValue = "0")int a, @RequestParam(value = "b", defaultValue = "0")String b,@RequestParam(value = "c", defaultValue = "0")int c){
        int d = 0;
        if(b.equals("+")){
            d = a+c;
        }
        else if(b.equals("-")){
            d = a-c;
        }
        else if(b.equals("*")){
            d = a*c;
        }
        else if (b.equals("/")){
            d = a/c;
        }
        return d;
    }
}

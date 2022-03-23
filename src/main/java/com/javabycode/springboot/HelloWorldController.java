package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="world") String name) {
        
        String message="Successfully Launched  Spring Boot Project using CI & CD pipeline";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        
        return "hello";
    }
}

package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

//    brings both data in and puts data back out
    @GetMapping("greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "Hello Yordan");
        // the return is a view of a greeting.jsp
        return "greeting";
    }



}

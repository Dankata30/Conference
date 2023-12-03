package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    // Only displays the page
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration") Registration registration){

        return "registration";
    }

    // Makes the post request with the name
    @PostMapping ("registration")
    public String addRegistration(@Valid @ModelAttribute ("registration") Registration registration,
                                  BindingResult result){
        if(result.hasErrors()){
            System.out.println("there were errors");
            return "registration";
        }

        System.out.println("Registration: " + registration.getName());
        return "redirect:registration";
    }
}

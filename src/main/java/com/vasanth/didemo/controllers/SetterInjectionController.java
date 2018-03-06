package com.vasanth.didemo.controllers;

import com.vasanth.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingServiceImpl greetingService;

    @Autowired
    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting()+" from SetterInjectionController";
    }
}

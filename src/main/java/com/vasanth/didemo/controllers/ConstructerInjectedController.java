package com.vasanth.didemo.controllers;

import com.vasanth.didemo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructerInjectedController {

    private GreetingServiceImpl greetingService;

    public ConstructerInjectedController(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting()+" from ConstructerInjectedController";
    }
}

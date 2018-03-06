package com.vasanth.didemo.controllers;

import com.vasanth.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting()+" from PropertyInjectedController";
    }

}

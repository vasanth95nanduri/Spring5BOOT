package com.vasanth.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private final String greeting = "Hello Vasanth";

    @Override
    public String sayGreeting() {
        return greeting;
    }
}

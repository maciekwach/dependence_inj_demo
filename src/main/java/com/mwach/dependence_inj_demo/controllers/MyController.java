package com.mwach.dependence_inj_demo.controllers;


import com.mwach.dependence_inj_demo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController
{

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello()
    {
        System.out.println("Hello MyControl!");

        return greetingService.sayGreeting();
    }
}

package com.mwach.dependence_inj_demo.controllers;

import com.mwach.dependence_inj_demo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
    return greetingService.sayGreeting();
    }

}

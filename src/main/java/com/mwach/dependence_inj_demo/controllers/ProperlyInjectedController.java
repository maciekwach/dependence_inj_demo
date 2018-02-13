package com.mwach.dependence_inj_demo.controllers;

import com.mwach.dependence_inj_demo.services.GreetingService;
import com.mwach.dependence_inj_demo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProperlyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService; //Impl?

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

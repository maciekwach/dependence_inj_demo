package com.mwach.dependence_inj_demo.controllers;

import com.mwach.dependence_inj_demo.services.GreetingService;
import com.mwach.dependence_inj_demo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProperlyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl; // Could change,if property name matches to bean name

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}

package com.mwach.dependence_inj_demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService  implements GreetingService{

    @Override
    public String sayGreeting() {
        return "hello - primary greeting service";
    }
}




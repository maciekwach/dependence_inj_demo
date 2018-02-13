package com.mwach.dependence_inj_demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{


    public static final String HELLO_MW = "Hello MW";


    @Override
    public String sayGreeting() {
        return HELLO_MW;
    }
}

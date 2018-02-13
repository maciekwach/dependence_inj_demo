package com.mwach.dependence_inj_demo.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController
{

    public String hello()
    {
        System.out.println("Hello MyControl!");
        return "foo";
    }
}

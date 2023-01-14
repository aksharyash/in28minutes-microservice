package com.in28minutes.microservices.limitsservice.controller;

import com.in28minutes.microservices.limitsservice.bean.Limits;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;

    @GetMapping(value = "/limits")
    public Limits retriveLimits(){
    return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}

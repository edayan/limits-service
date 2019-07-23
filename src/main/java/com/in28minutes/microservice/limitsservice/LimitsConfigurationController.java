package com.in28minutes.microservice.limitsservice;

import com.in28minutes.microservice.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitConfigurations() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}

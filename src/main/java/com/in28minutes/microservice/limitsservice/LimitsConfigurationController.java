package com.in28minutes.microservice.limitsservice;

import com.in28minutes.microservice.limitsservice.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitConfigurations() {
        return new LimitConfiguration(1000, 1);
    }
}

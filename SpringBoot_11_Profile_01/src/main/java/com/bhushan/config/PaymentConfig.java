package com.bhushan.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "payment")
@Data
public class PaymentConfig {

    private int id;
    private double amount;
    private String method;

    // getters and setters
}
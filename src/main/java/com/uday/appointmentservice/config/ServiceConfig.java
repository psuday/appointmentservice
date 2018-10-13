package com.uday.appointmentservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@RefreshScope
public class ServiceConfig {

@Autowired
private Environment environment;


    @Value("${message}")
    private String message;

    @Value("${port}")
    private String port;

    @Value("${env}")
    private String env;

    public String getMessage() {
	return message;
    }

    public String getEnv() {
	return env;
    }

    public String getPort() {
	return port;
    }

    public String getFromEnv() {
	return environment.getProperty("env");
    }
}



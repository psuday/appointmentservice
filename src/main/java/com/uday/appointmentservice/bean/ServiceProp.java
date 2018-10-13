package com.uday.appointmentservice.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.cloud.context.config.annotation.RefreshScope;

// SO the Refreshscope annotation here is meant to allow development teams to dynamically pick
// up the change in properties in the configuration server. Why Dev teams - well the way it works
// is that beans have to be annotated with this annotation and then a specific end point 
// called /refresh has to be exposed via the actuator service in the application.yml file.
// So that end point can be accessed by the team via a POST (have to use curl or equivalent
// for this) to get the newly changed properties.
// Obviously in production this is not the approach - so there a push mechanism is used by
// the config server in order to refresh all instances.

// Beans have to be annotated - doing the annotation at the REST Controller level doesnt do anything.

@Component
@RefreshScope
public class ServiceProp {

    @Value("${port}")
    private String tracerProperty;

    public String getTracerProperty() {
	return tracerProperty;
    }
}

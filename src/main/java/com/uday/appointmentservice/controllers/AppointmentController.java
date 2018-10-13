package com.uday.appointmentservice.controllers;

import com.uday.appointmentservice.model.Appointment;
import com.uday.appointmentservice.service.AppointmentService;
import com.uday.appointmentservice.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RestController
@RequestMapping(value="v1/{facilityId}/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private ServiceConfig serviceConfig;

    @RequestMapping(value="/{appointmentId}",method = RequestMethod.GET)
    public Appointment getAppointment( @PathVariable("appointmentId") String appointmentId) {

        Appointment result =  appointmentService.getAppointment(appointmentId);
	if (result == null) 
	    return new Appointment(" ", " ", serviceConfig.getMessage());
	else 
	    return result;
    }

   
    @RequestMapping(value="/prop/fromEnv", method = RequestMethod.GET)
    public String getFromEnvProperty() {
	return serviceConfig.getFromEnv();
    }

    @RequestMapping(value="/prop/env", method = RequestMethod.GET) 
    public String getEnvProperty() {
	return serviceConfig.getEnv();
    }

    @RequestMapping(value="/prop/port", method = RequestMethod.GET)
    public String getPortProperty() {
	return serviceConfig.getPort();
    }

    @RequestMapping(value="/prop/message", method = RequestMethod.GET)
    public String getMessage() {
	return serviceConfig.getMessage();
    }

}

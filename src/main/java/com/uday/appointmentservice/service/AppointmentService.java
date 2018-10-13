package com.uday.appointmentservice.service;

import com.uday.appointmentservice.config.ServiceConfig;
import com.uday.appointmentservice.model.Appointment;
import com.uday.appointmentservice.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository<String, Appointment> appointmentRepository;

    @Autowired
    ServiceConfig config;

    public Appointment getAppointment(String appointmentId) {

	return appointmentRepository.get(appointmentId);
    }


    public void saveAppointment(Appointment appointment){

        appointmentRepository.add(appointment);

    }

    public void updateAppointment(Appointment appointment){
      appointmentRepository.update(appointment);
    }

    public void deleteAppointment(Appointment appointment){
        appointmentRepository.remove( appointment.getAppointmentId());
    }

}

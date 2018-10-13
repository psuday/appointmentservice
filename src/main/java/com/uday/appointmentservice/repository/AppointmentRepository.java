package com.uday.appointmentservice.repository;

import com.uday.appointmentservice.model.Appointment;

public interface AppointmentRepository<T,Appointment> {

    void add(Appointment entity);
    void remove(T id);
    void update(Appointment entity);

    boolean contains(T id);
    Appointment get(T id);
    

}

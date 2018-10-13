package com.uday.appointmentservice.repository;

import com.uday.appointmentservice.repository.AppointmentRepository;
import com.uday.appointmentservice.model.Appointment;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class InMemAppointmentRepo implements AppointmentRepository<String, Appointment> {

    private Map<String, Appointment> entities;  // data structure to hold restaurants.

    public InMemAppointmentRepo() {

	entities = new HashMap<>();
	entities.put("1", new Appointment("1","1","First Appointment"));
	entities.put("2", new Appointment("2","1","Second Appointment"));
	entities.put("3", new Appointment("3","2","Third Appointment"));

		    
    }

    public boolean containsName(String name) {
	return entities.containsKey(name);
    }

    public void add(Appointment entity) {
	entities.put(entity.getAppointmentId(), entity);
    }

    public void remove(String id) {
	if (entities.containsKey(id)) 
	    entities.remove(id);
    }

    public void update(Appointment entity) {
	if (entities.containsKey(entity.getAppointmentId()))
	    entities.put(entity.getAppointmentId(), entity);
    }

    public boolean contains(String id) {
	return containsName(id);
    }

    public Appointment get(String id) {
	return entities.get(id);
    }

    public Collection<Appointment> getAll() {
	return  entities.values();
    }

}

package com.uday.appointmentservice.model;


public class Appointment {

    private String appointmentId;


    private String facilityId;


    private String comment;

    public Appointment(String appointmentId, String facilityId, String comment) {
	this.appointmentId = appointmentId;
	this.facilityId = facilityId;
	this.comment = comment;
    }


    public String getAppointmentId() {
	return appointmentId;
    }

    public String getComment() {
	return this.comment;
    }

    public void setAppointmentId(String id) {
	this.appointmentId = id;
    }

    public void setFacilityId(String id) {
	this.facilityId = id;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }
}

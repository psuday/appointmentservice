package com.uday.appointmentservice.model;


public class Entity<T> {
    T id;
    String name;

    public Entity(T id, String name) {
	this.id = id;
	this.name = name;
    }

    public T getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public void setId(T id) {
	this.id = id;
    }

    public void setName(String name) {
	this.name = name;
    }
}

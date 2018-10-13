Sat 10/13/2018 03:10 PM

This repository contains the code for a simple Spring Boot Application
that acts as a Spring Cloud Config client. It has a controller that
gets configuration data served by the config server.

The configuration data is consumed as directly injected @Value
attributes and via the Environment abstraction.

The microservice exposes the following end points:

http://localhost:8080/v1/1/appointments/prop/port
http://localhost:8080/v1/1/appointments/prop/env
http://localhost:8080/v1/1/appointments/prop/message

etc. where the port, env, message are simple configuration attributes.


The bootstrap.yml file in src\main\resources points to the location of
the configuration server.

The desired environment is specified in the spring.profiles.active
property value in application.yml.


The pom.xml gives the required dependencies for a spring cloud config
client.


First get the configserver running at localhost:8888
and then clone this repo or download the zip archive and execute

mvn spring-boot:run

This will start up the appointmentservice at localhost:8080 and it 
will grab the configuration data from localhost:8888




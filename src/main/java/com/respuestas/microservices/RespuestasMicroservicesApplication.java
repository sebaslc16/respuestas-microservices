package com.respuestas.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan({"com.respuestas.microservices.models.entity","com.commons.alumnos.models.entity",
		     "com.commonsexamns.entity"})
public class RespuestasMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RespuestasMicroservicesApplication.class, args);
	}

}

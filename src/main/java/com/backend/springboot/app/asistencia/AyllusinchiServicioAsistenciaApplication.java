package com.backend.springboot.app.asistencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class AyllusinchiServicioAsistenciaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyllusinchiServicioAsistenciaApplication.class, args);
    }

}

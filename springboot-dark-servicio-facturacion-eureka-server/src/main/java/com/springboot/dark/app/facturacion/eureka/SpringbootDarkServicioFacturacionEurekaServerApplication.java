package com.springboot.dark.app.facturacion.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootDarkServicioFacturacionEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDarkServicioFacturacionEurekaServerApplication.class, args);
	}

}

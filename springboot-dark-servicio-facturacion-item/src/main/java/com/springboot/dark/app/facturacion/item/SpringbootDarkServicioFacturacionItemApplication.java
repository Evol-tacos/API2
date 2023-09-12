package com.springboot.dark.app.facturacion.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringbootDarkServicioFacturacionItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDarkServicioFacturacionItemApplication.class, args);
	}

}

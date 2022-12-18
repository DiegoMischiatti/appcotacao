package br.edu.infnet.hospedes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HospedesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospedesApplication.class, args);
	}

}

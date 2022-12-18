package br.edu.infnet.quarto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class QuartoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartoApplication.class, args);
	}

}

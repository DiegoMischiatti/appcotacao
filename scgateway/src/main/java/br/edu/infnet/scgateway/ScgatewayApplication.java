package br.edu.infnet.scgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ScgatewayApplication {

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
				
				.route(p -> p.path("/hospede/**")

				        .uri("http://localhost:8780"))
				
				.route(p -> p.path("/quarto/**")
						.filters(f ->f.circuitBreaker(config -> config.setName("mycmd")
								.setFallbackUri("forward:/fallback"))
								)
						

						.uri("http://localhost:8585"))

				.route(p -> p.path("/reservas/**")
						.filters(f ->f.circuitBreaker(config -> config.setName("mycmd")
								.setFallbackUri("forward:/fallback"))
								)
						
						.uri("http://localhost:8181"))

				.build();

	}
	@GetMapping("/fallback")
	public String fallback() {
		return "volte mais tarde";
	}

	public static void main(String[] args) {
		SpringApplication.run(ScgatewayApplication.class, args);
	}

}

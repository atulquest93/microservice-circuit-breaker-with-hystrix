package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class CertficiationMicroservice1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(CertficiationMicroservice1Application.class, args);
	}
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate(){
	    return new RestTemplate();
	}
}

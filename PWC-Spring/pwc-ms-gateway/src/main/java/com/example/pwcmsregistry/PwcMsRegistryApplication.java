package com.example.pwcmsregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class PwcMsRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwcMsRegistryApplication.class, args);
	}

}

package com.chanideals.graphql.GraphQLDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GraphQlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello, GraphQL";
	}

}

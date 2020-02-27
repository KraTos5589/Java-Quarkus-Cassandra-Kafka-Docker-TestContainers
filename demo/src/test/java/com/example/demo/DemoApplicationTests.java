package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void text1() {
		WebClient
				.create("http://localhost:8080/api")
				.post()
				.uri(uriBuilder -> uriBuilder
						.path("/person")
						.build())
				.body(new Person("1","Luke Skywalker"), Person.class)
				.retrieve();

		WebClient
				.create("http://localhost:8080/api")
				.post()
				.uri(uriBuilder -> uriBuilder
						.path("/person")
						.build())
				.body(new Person("2","Darth Vader"), Person.class)
				.retrieve();

		WebClient
				.create("http://localhost:8080/api")
				.post()
				.uri(uriBuilder -> uriBuilder
						.path("/person")
						.build())
				.body(new Person("3","Gandalf"), Person.class)
				.retrieve();


		System.out.println(WebClient
				.create("http://localhost:8080/api")
				.get()
				.uri(uriBuilder -> uriBuilder
						.path("/person")
						.build()).retrieve().bodyToFlux(Person.class).toString());
	}

}

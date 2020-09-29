package org.coffee.docker.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.hamcrest.CoreMatchers.equalTo;

@WebFluxTest(CoffeeController.class)
class CoffeeControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @Test
    public void testGetEmployeeById() {
        String coffee = "Some coffee";

        webTestClient.get()
                .uri("/coffee")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .value(value -> value, equalTo(coffee));
    }

}
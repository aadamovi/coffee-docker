package org.coffee.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CheckInController {

    @GetMapping("/checkin")
    @ResponseBody
    public Mono<String> getCoffee() {
        return Mono.just("Some coffee");
    }
}

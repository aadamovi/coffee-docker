package org.coffee.docker.controller;

import org.coffee.docker.dto.CoffeeDto;
import org.coffee.docker.service.CoffeeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class CoffeeController {

    private final CoffeeDataService coffeeInfoService;

    @Autowired
    public CoffeeController(CoffeeDataService coffeeInfoService) {
        this.coffeeInfoService = coffeeInfoService;
    }

    @GetMapping("/coffee/roastery")
    @ResponseBody
    public Flux<CoffeeDto> getCoffeePerRoastery(String roastery) {
        return coffeeInfoService.getAllCoffeesPerRoastery(roastery);
    }

    @GetMapping("/coffee/shop")
    @ResponseBody
    public Flux<CoffeeDto> getCoffeePerCoffeeShop(String shop) {
        return coffeeInfoService.getAllCoffeesPerShop(shop);
    }

    @PostMapping("/coffee")
    @ResponseBody
    public void saveCoffee(CoffeeDto coffeeDto) {
        coffeeInfoService.saveCoffee(coffeeDto);
    }
}

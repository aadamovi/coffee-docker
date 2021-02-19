package org.coffee.docker.service;

import org.coffee.docker.dto.CoffeeDto;
import reactor.core.publisher.Flux;

public interface CoffeeDataService {

    Flux<CoffeeDto> getAllCoffeesPerRoastery(String roastery);

    Flux<CoffeeDto> getAllCoffeesPerShop(String coffeeShop);

    void saveCoffee(CoffeeDto dto);
}

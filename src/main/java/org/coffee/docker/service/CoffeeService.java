package org.coffee.docker.service;

import org.coffee.docker.domain.Coffee;
import org.coffee.docker.dto.CoffeeDto;
import org.coffee.docker.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Collections;

import static org.coffee.docker.dto.CoffeeDto.fromCoffeeToDto;

@Service
public class CoffeeService implements CoffeeDataService {

    private final CoffeeRepository coffeeRepository;

    @Autowired
    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public Flux<CoffeeDto> getAllCoffeesPerRoastery(String roastery) {
        return coffeeRepository.findAllById(Collections.singletonList(roastery))
            .map(fromCoffeeToDto());
    }

    @Override
    public Flux<CoffeeDto> getAllCoffeesPerShop(String coffeeShop) {
        return coffeeRepository.findAllById(Collections.singletonList(coffeeShop))
            .map(fromCoffeeToDto());
    }

    @Override
    public void saveCoffee(CoffeeDto dto) {
        final Coffee coffee = new Coffee.Builder()
            .with(builder -> {
                builder.name = dto.getName();
                builder.origin = dto.getOrigin();
                builder.type = dto.getType();
                builder.roastery = dto.getRoastery();
                builder.rating = dto.getRating();
                builder.comment = dto.getComment();
            })
            .build();
        coffeeRepository.save(coffee);
    }
}

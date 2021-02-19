package org.coffee.docker.repository;

import org.coffee.docker.domain.Coffee;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CoffeeRepository extends ReactiveCassandraRepository<Coffee, String> {

    Flux<String> selectAllCoffeesPerRoastery(String roastery);
}

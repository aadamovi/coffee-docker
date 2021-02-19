package org.coffee.docker.repository;

import org.coffee.docker.domain.Coffee;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface RoasteryRepository extends ReactiveCassandraRepository<Coffee, String> {
}

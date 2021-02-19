package org.coffee.docker.domain;

import java.util.List;
import java.util.Set;

public class Roastery {
    private long id;
    private String name;
    private String description;
    private Set<Coffee> coffee;
    private List<String> address;
}

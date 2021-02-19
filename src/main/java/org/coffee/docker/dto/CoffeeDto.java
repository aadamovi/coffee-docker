package org.coffee.docker.dto;

import org.coffee.docker.domain.Coffee;
import org.coffee.docker.domain.Roastery;
import org.coffee.docker.domain.type.CoffeeType;
import org.coffee.docker.domain.type.Rating;

import java.util.function.Function;

public class CoffeeDto {
    private String name;
    private String origin;
    private CoffeeType type;
    private Roastery roastery;
    private Rating rating;
    private String comment;

    public CoffeeDto(String name, String origin, CoffeeType type, Roastery roastery, Rating rating, String comment) {
        this.name = name;
        this.origin = origin;
        this.type = type;
        this.roastery = roastery;
        this.rating = rating;
        this.comment = comment;
    }

    public static Function<Coffee, CoffeeDto> fromCoffeeToDto() {
        return coffee -> new CoffeeDto(coffee.getName(),
            coffee.getOrigin(),
            coffee.getType(),
            coffee.getRoastery(),
            coffee.getRating(),
            coffee.getComment());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    public Roastery getRoastery() {
        return roastery;
    }

    public void setRoastery(Roastery roastery) {
        this.roastery = roastery;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

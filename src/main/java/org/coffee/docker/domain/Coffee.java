package org.coffee.docker.domain;

import org.coffee.docker.domain.type.CoffeeType;
import org.coffee.docker.domain.type.Rating;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.function.Consumer;

@Table("coffee")
public class Coffee {
    @PrimaryKey
    private final String name;
    private final String origin;
    private final CoffeeType type;
    private final Roastery roastery;
    private final Rating rating;
    private final String comment;

    public Coffee(Builder builder) {
        this.name = builder.name;
        this.origin = builder.origin;
        this.type = builder.type;
        this.roastery = builder.roastery;
        this.rating = builder.rating;
        this.comment = builder.comment;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public CoffeeType getType() {
        return type;
    }

    public Roastery getRoastery() {
        return roastery;
    }

    public Rating getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public static class Builder {
        public String name;
        public String origin;
        public CoffeeType type;
        public Roastery roastery;
        public Rating rating;
        public String comment;

        public Builder with(Consumer<Builder> consumer) {
            consumer.accept(this);
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}

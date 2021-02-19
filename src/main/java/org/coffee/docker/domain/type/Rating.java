package org.coffee.docker.domain.type;

public enum Rating {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private int numeric;

    Rating(int numeric) {
        this.numeric = numeric;
    }
}

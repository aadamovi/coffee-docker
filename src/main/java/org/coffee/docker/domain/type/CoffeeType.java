package org.coffee.docker.domain.type;

public enum CoffeeType {
    ESPRESSO("espresso"),
    LATTE("latte"),
    MOKKA("mokka");

    private String desc;

    CoffeeType(String desc) {
        this.desc = desc;
    }
}

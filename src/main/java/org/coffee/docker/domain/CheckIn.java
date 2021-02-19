package org.coffee.docker.domain;

public class CheckIn {
    private String userName;
    private String coffee;
    private String coffeeServingType;
    private String image;
    private String comment;
    private String rating;

    public String getUserName() {
        return userName;
    }

    public String getCoffee() {
        return coffee;
    }

    public String getCoffeeServingType() {
        return coffeeServingType;
    }

    public String getImage() {
        return image;
    }

    public String getComment() {
        return comment;
    }

    public String getRating() {
        return rating;
    }
}

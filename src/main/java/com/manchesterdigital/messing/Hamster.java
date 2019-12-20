package com.manchesterdigital.messing;

public class Hamster {
    private String colour;
    private int weight;
    private int numOfWhiskers;


    public Hamster(int weight) {
        this(weight, "brown");
    }


    public Hamster(int weight, String colour) {
        this(weight, colour, 6);
    }


    public Hamster(int weight, String colour, int numOfWhiskers) {
        this.weight = weight;
        this.colour = colour;
        this.numOfWhiskers = numOfWhiskers;
    }

    public String getColour() {
        return colour;
    }

    public int getNumOfWhiskers() {
        return numOfWhiskers;
    }

    public int getWeight() {
        return weight;
    }
}

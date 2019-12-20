package com.manchesterdigital.messing;

public class HamsterConstructorCheck {

    public static void main(String[] args) {
        // three separate constructors that use each other. Also known as constructor chaining.

        Hamster hamsterConstructor1 = new Hamster(4);
        Hamster hamsterConstructor2 = new Hamster(4, "yellow");
        Hamster hamsterConstructor3 = new Hamster(4, "black", 4);
        System.out.println("HamsterConstructor1 is " + hamsterConstructor1.getColour() + " and has no of Whiskers: " + hamsterConstructor1.getNumOfWhiskers());
        System.out.println("HamsterConstructor2 is " + hamsterConstructor2.getColour() + " and has no of Whiskers: " + hamsterConstructor2.getNumOfWhiskers());
        System.out.println("HamsterConstructor3 is " + hamsterConstructor3.getColour() + " and has no of Whiskers: " + hamsterConstructor3.getNumOfWhiskers());
        System.out.println("Can see default values (as all weight the same in example) " + hamsterConstructor1.getWeight() + hamsterConstructor1.getColour() + hamsterConstructor1.getNumOfWhiskers());
    }
}

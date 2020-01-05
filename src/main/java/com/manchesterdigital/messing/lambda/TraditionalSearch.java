package com.manchesterdigital.messing.lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {


    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        animals.add(new Animal("fish", false, true));

        print(animals, new CheckIfHopper()); // pass class that does check for Hopper. Or Could do lambda instead

        print(animals, new CheckIfSwimmer());

        print(animals, a -> a.canHop()); // lambda. boolean, return it or not?

        print(animals, Animal::canSwim); // method Reference

        // Doesn't work with just the a.toStringLambda method. Print method expecting boolean as second CheckTrait.
        print(animals, a -> a.toStringLambda() != null);

    }


        private static void print(List<Animal> animals, CheckTrait checker) {
            for (Animal animal : animals) {
                if (checker.test(animal)) {
                    System.out.print(animal.toStringLambda() + " ");
                }
            }
            System.out.println();
    }
}
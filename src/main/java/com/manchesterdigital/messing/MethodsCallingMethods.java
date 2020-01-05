package com.manchesterdigital.messing;

public class MethodsCallingMethods {

    public static void main(String[] args) {
        int mass = 70219;
        Integer resultThroughMethodCallingItself = calculateFuelForMass(mass, mass);
        int result = 23404 + (7799 + (2597 + (863 + ( 285 + (93 + (29 +7))))));
        System.out.println(resultThroughMethodCallingItself);
        System.out.println(result);


    }

    private static Integer calculateFuelForMass(Integer startingMass, Integer mass) {
        if (mass > 0) {
            if (mass.equals(startingMass)) {
                return calculateFuelForMass(startingMass, (mass / 3) - 2);
            } else {
                return mass + calculateFuelForMass(startingMass, (mass / 3) - 2);
            }
        }
        return 0;
    }
}

package adventofcode.dayOne;

import adventofcode.FeatureHandler;
import adventofcode.Runner;

import static adventofcode.FeatureHandler.*;

public class DayOne implements Runner {

    protected Integer calculateTotalFuelRequirement(String mass) {
        Integer fuelCounterUpper = 0;
        String[] split = splitInput(mass);

        for (String s : split) {
            Integer fuelNeeded = FuelCalculator.fuelByMassCalculator(Integer.parseInt(s));
            fuelCounterUpper += fuelNeeded;

            if (FEATURE_MASS_OF_FUEL_ADDED_TO_TOTAL) {
                while (fuelNeeded > 0) {
                    fuelNeeded = FuelCalculator.fuelByMassCalculator(fuelNeeded);
                    if (fuelNeeded > 0) {
                        fuelCounterUpper += fuelNeeded;
                    }
                }
            }
        }
        return fuelCounterUpper;
    }


    private String[] splitInput(String masses){
        return masses.split("\n");
    }


    @Override
    public String run (String inputFile){
        return calculateTotalFuelRequirement(inputFile).toString();
    }
}

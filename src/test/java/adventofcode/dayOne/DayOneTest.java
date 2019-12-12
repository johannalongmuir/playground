package adventofcode.dayOne;

import adventofcode.FeatureHandler;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DayOneTest {

    // TODO refactor tests.
    // TODO add negative numbers to test

    @Test
    public void whenGiven12WhenPassThroughFuelByMassCalculatorReturn2() {
        Integer mass = 12;
        double result = FuelCalculator.fuelByMassCalculator(mass);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenGiven14WhenPassThroughFuelByMassCalculatorReturn2() {
        Integer mass = 14;
        double result = FuelCalculator.fuelByMassCalculator(mass);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenGiven100756WhenPassThroughFuelByMassCalculatorReturn33583() {
        Integer mass = 100756;
        double result = FuelCalculator.fuelByMassCalculator(mass);
        Assertions.assertThat(result).isEqualTo(33583);
    }

    @Test
    public void whenGivenFiveValuesFromStringBuilderResultCalculates() {
        givenAllFeaturesStartOff();
        String mass = "70219\n" + "93253\n" + "79077\n" + "75104\n" + "142278\n";
        DayOne dayOne = new DayOne();
        String result = dayOne.run(mass);
        Assertions.assertThat(result).isEqualTo("153299");
    }


    @Test
    public void whenGivenRequirementToIncludeFuelForMassOfFuel() {
        givenAllFeaturesStartOff();
        givenFeatureMassOfFuelAddedToTotal();
        String mass = "1969\n";
        DayOne dayOne = new DayOne();
        String result = dayOne.run(mass);
        Assertions.assertThat(result).isEqualTo("966");
    }

    @Test
    public void whenGiven14ncludeFuelForMassOfFuel() {
        givenAllFeaturesStartOff();
        givenFeatureMassOfFuelAddedToTotal();
        String mass = "14\n";
        DayOne dayOne = new DayOne();
        String result = dayOne.run(mass);
        Assertions.assertThat(result).isEqualTo("2");
    }

    @Test
    public void whenGiven100756ToIncludeFuelForMassOfFuel() {
        givenAllFeaturesStartOff();
        givenFeatureMassOfFuelAddedToTotal();
        String mass = "100756\n";
        DayOne dayOne = new DayOne();
        String result = dayOne.run(mass);
        Assertions.assertThat(result).isEqualTo("50346");
    }


    private void givenAllFeaturesStartOff() {
        FeatureHandler.FEATURE_MASS_OF_FUEL_ADDED_TO_TOTAL = false;
    }

    private void givenFeatureMassOfFuelAddedToTotal() {
        FeatureHandler.FEATURE_MASS_OF_FUEL_ADDED_TO_TOTAL = true;
    }

}
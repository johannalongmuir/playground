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
        StringBuilder mass = new StringBuilder();
        DayOne dayOne = new DayOne();
        mass.append("70219\n");
        mass.append("93253\n");
        mass.append("79077\n");
        mass.append("75104\n");
        mass.append("142278\n");
        String result = dayOne.run(mass);
        Assertions.assertThat(result).isEqualTo("153299");
    }


    @Test
    public void whenGivenRequirementToIncludeFuelForMassOfFuel() {
        givenAllFeaturesStartOff();
        givenFeatureMassOfFuelAddedToTotal();
        StringBuilder mass = new StringBuilder();
        DayOne dayOne = new DayOne();
        mass.append("1969\n");
        String result = dayOne.run(mass);
        Assertions.assertThat(result).isEqualTo("966");
    }

    @Test
    public void whenGiven14ncludeFuelForMassOfFuel() {
        givenAllFeaturesStartOff();
        givenFeatureMassOfFuelAddedToTotal();
        StringBuilder mass = new StringBuilder();
        DayOne dayOne = new DayOne();
        mass.append("14\n");
        String result = dayOne.run(mass);
        Assertions.assertThat(result).isEqualTo("2");
    }

    @Test
    public void whenGiven100756ToIncludeFuelForMassOfFuel() {
        givenAllFeaturesStartOff();
        givenFeatureMassOfFuelAddedToTotal();
        StringBuilder mass = new StringBuilder();
        DayOne dayOne = new DayOne();
        mass.append("100756\n");
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
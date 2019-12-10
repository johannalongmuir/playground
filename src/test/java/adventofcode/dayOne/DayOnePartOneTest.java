package adventofcode.dayOne;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DayOnePartOneTest {

    // TODO refactor tests.
    // TODO add negative numbers to test

    @Test
    public void whenGiven12Return2() {
        Integer mass = 12;
        double result = DayOnePartOne.fuelCalculator(mass);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenGiven14Return2() {
        Integer mass = 14;
        double result = DayOnePartOne.fuelCalculator(mass);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenGiven100756Return33583() {
        Integer mass = 100756;
        double result = DayOnePartOne.fuelCalculator(mass);
        Assertions.assertThat(result).isEqualTo(33583);
    }

    @Test
    public void whenGivenFiveValuesFromStringBuilderResultCalculates() {
        StringBuilder mass = new StringBuilder();
        DayOnePartOne dayOne = new DayOnePartOne();
        mass.append("70219\n");
        mass.append("93253\n");
        mass.append("79077\n");
        mass.append("75104\n");
        mass.append("142278\n");
        String result = dayOne.run(mass);
        Assertions.assertThat(result).isEqualTo("153299");



    }
}
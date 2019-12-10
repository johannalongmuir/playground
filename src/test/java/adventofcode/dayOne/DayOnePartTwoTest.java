package adventofcode.dayOne;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class DayOnePartTwoTest {


    // TODO refactor test names etc

    @Test
    public void whenGivenRequirementToIncludeFuelForMassOfFuel() {
        StringBuilder mass = new StringBuilder();
        DayOnePartTwo dayOnePartTwo = new DayOnePartTwo();
        mass.append("1969\n");
        String result = dayOnePartTwo.run(mass);
        Assertions.assertThat(result).isEqualTo("966");
    }

    @Test
    public void whenGiven14ncludeFuelForMassOfFuel() {
        StringBuilder mass = new StringBuilder();
        DayOnePartTwo dayOnePartTwo = new DayOnePartTwo();
        mass.append("14\n");
        String result = dayOnePartTwo.run(mass);
        Assertions.assertThat(result).isEqualTo("2");
    }

    @Test
    public void whenGiven100756ToIncludeFuelForMassOfFuel() {
        StringBuilder mass = new StringBuilder();
        DayOnePartTwo dayOnePartTwo = new DayOnePartTwo();
        mass.append("100756\n");
        String result = dayOnePartTwo.run(mass);
        Assertions.assertThat(result).isEqualTo("50346");
    }

}
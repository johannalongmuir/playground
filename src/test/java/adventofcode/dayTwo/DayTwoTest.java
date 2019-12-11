package adventofcode.dayTwo;

import adventofcode.FeatureHandler;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class DayTwoTest {

    /*--- Day 2: 1202 Program Alarm ---

    Here are the initial and final states of a few more small programs:
    2,3,0,3,99 becomes 2,3,0,6,99.
    2,4,4,5,99,0 becomes 2,4,4,5,99,9801.
    1,1,1,4,99,5,6,0,99 becomes 30,1,1,4,2,5,6,0,99.
    1,9,10,3,92,3,11,0,9,30,40,50 becomes 3500,9,10,70,2,3,11,0,99,30,40,50

    Restore the gravity assist program (your puzzle input)
    to the "1202 program alarm" state it had just before the last computer caught fire.
    To do this, before running the program, replace position 1 with the value 12 and replace
    position 2 with the value 2.
    What value is left at position 0 after the program halts?


    determine what pair of inputs produces the output 19690720."
    The inputs should still be provided to the program by replacing the values at addresses 1 and 2, just like before.
     */


    @Test
    public void returnResultAtPosition0() {
        givenAllFeaturesStartOff();
        String result = whenRunDayTwo("1,0,0,0,99");
        thenResultAtAddressOneis("2", result);
    }

    @Test
    public void returnExpectedResultResult() {
        givenAllFeaturesStartOff();
        List<Integer> integers = whenRunComputer("1,0,0,0,99");
        thenResultString("[2, 0, 0, 0, 99]", integers.toString());
    }

    @Test
    public void gravityAssistOn() {
        givenAllFeaturesStartOff();
        givenFeatureRestoreGravityAssistSetToTrue();
        List<Integer> integers = whenRunComputer("1,3,4,0,99,2,3,4,4,5,6,7,7,8,8");
        Assertions.assertThat(integers.get(1)).isEqualTo(12);
        Assertions.assertThat(integers.get(2)).isEqualTo(2);
    }

    // TODO complete test for feature reverse + check
//    @Test
//    public void givenFeatureReverseSetToOn() {
//        givenAllFeaturesStartOff();
//        givenFeatureReverseSetToTrue();
//
//    }

    private void givenAllFeaturesStartOff() {
        FeatureHandler.FEATURE_RESTORE_GRAVITY_ASSIST = false;
        FeatureHandler.FEATURE_TEST_RESULT = false;
        FeatureHandler.FEATURE_REVERSE = false;
    }



    private StringBuilder givenInputFileContaining(String input) {
        StringBuilder inputFile = new StringBuilder();
        return inputFile.append(input);
    }

    private void givenFeatureRestoreGravityAssistSetToTrue() {
        FeatureHandler.FEATURE_RESTORE_GRAVITY_ASSIST = true;
    }

    private void givenFeatureReverseSetToTrue() {
        FeatureHandler.FEATURE_REVERSE = true;
    }

    private String whenRunDayTwo(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        DayTwo dayTwo = new DayTwo();
        return dayTwo.run(stringBuilder);
    }

    private List<Integer> whenRunComputer(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        DayTwo dayTwo = new DayTwo();
        return dayTwo.computer(dayTwo.splitInput(stringBuilder));
    }

    private void thenResultAtAddressOneis(String resultSectionOne, String result) {
        Assertions.assertThat(result).startsWith(resultSectionOne);

    }

    private void thenResultString(String resultString, String result) {
        Assertions.assertThat(result).isEqualTo(resultString);
    }


}
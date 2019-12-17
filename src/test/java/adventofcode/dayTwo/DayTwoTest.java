package adventofcode.dayTwo;

import adventofcode.FeatureHandler;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.lang.model.element.AnnotationValue;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayTwoTest {

    private String result;
    private String intcodeProgram;
    private List<Integer> resultList;
    private List<Integer> expectedResults;


    @Test
    public void whenGivenIntcodeCheckAddressOneContainsCorrectValue() {
        givenAllFeaturesStartOff();
        givenIntcodeProgram("1,0,0,0,99");
        whenRunDayTwo();
        thenResultAtAddressZeroisAsString("2");
    }

    @Test
    public void whenGivenIntcodeCheckListReturnedisExpected() {
        givenAllFeaturesStartOff();
        givenIntcodeProgram("1,0,0,0,99");
        givenExpectedResults("2,0,0,0,99");
        whenRunintcodeComputer();
        thenResultListMatchesExpectedList();
    }

    @Test
    public void whenGivenIntcodeProgramWithOpcode2ThenListReturnedMatchesExpected() {
        givenAllFeaturesStartOff();
        givenIntcodeProgram("1,9,10,3,2,3,11,0,99,30,40,50");
        givenExpectedResults("3500,9,10,70,2,3,11,0,99,30,40,50");
        whenRunintcodeComputer();
        thenResultListMatchesExpectedList();
    }

    @Test
    public void gravityAssistOn() {
        givenAllFeaturesStartOff();
        givenFeatureRestoreGravityAssistSetToTrue();
        givenIntcodeProgram("1,0,0,0,99,1,0,0,0,1,0,0,0,1,0,0,0");
        whenRunintcodeComputer();
        thenResultAtAddressOneis(12);
        thenResultAtAddressTwois(2);
    }

    @Test
    public void givenFeatureReverseSetToOn() {
        givenAllFeaturesStartOff();
        givenFeatureReverseSetToTrue();
        givenOutputToCheck(19690720);
        givenFullFileInput();
        whenRunintcodeComputer();
        thenResultAtAddressOneis(23);
        thenResultAtAddressTwois(47);
    }

//    @Test
//    public void givenInvalidOpcode() {
//        // TODO this test doesn't check the output properly.
//        givenAllFeaturesStartOff();
//        givenIntcodeProgram("1,0,0,0,0,0,0,0,99");
//        whenRunDayTwo();
//        thenSystemErrorLogged();
//    }




    private void givenAllFeaturesStartOff() {
        FeatureHandler.FEATURE_RESTORE_GRAVITY_ASSIST = false;
        FeatureHandler.FEATURE_REVERSE = false;
    }

    private void givenFeatureRestoreGravityAssistSetToTrue() {
        FeatureHandler.FEATURE_RESTORE_GRAVITY_ASSIST = true;
    }

    private void givenFeatureReverseSetToTrue() {
        FeatureHandler.FEATURE_REVERSE = true;
    }


    private void givenIntcodeProgram(String initialIntcode) {
        intcodeProgram = initialIntcode;
    }

    private void givenExpectedResults(String expectedList) {
        expectedResults = Arrays.stream(expectedList.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private void givenOutputToCheck(Integer outputAt0) {
        DayTwo dayTwo = new DayTwo();
        dayTwo.GRAVITY_ASSIST_OUTPUT_ADDRESS_0 = outputAt0;
    }

    private void givenFullFileInput() {
        intcodeProgram = "1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,13,1,19,1,6,19,23,2,6,23,27,1,5,27,31,2,31,9,35,1,35,5," +
                "39,1,39,5,43,1,43,10,47,2,6,47,51,1,51,5,55,2,55,6,59,1,5,59,63,2,63,6,67,1,5,67,71,1,71,6,75,2,75," +
                "10,79,1,79,5,83,2,83,6,87,1,87,5,91,2,9,91,95,1,95,6,99,2,9,99,103,2,9,103,107,1,5,107,111,1,111,5," +
                "115,1,115,13,119,1,13,119,123,2,6,123,127,1,5,127,131,1,9,131,135,1,135,9,139,2,139,6,143,1,143,5," +
                "147,2,147,6,151,1,5,151,155,2,6,155,159,1,159,2,163,1,9,163,0,99,2,0,14,0";
    }


    private void whenRunDayTwo() {
        DayTwo dayTwo = new DayTwo();
        result = dayTwo.run(intcodeProgram);
    }

    private void whenRunintcodeComputer() {
        DayTwo dayTwo = new DayTwo();
        resultList = dayTwo.intcodeComputer(intcodeProgram);
    }

    private void thenResultAtAddressZeroisAsString(String addressOneExpected) {
        Assertions.assertThat(result).startsWith(addressOneExpected);
    }
    private void thenResultAtAddressOneis(int nounResult) {
        Assertions.assertThat(resultList.get(1)).isEqualTo(nounResult);
    }

    private void thenResultAtAddressTwois(int verbResult) {
        Assertions.assertThat(resultList.get(2)).isEqualTo(verbResult);
    }

    private void thenResultListNotEmpty () {
        Assertions.assertThat(resultList).isNotEmpty();
    }

    private void thenResultListMatchesExpectedList() {
        Assertions.assertThat(resultList).containsAll(expectedResults);
    }



    private void thenSystemErrorLogged () {
        System.out.println("need to see how to check log contains expected output");
    }


}
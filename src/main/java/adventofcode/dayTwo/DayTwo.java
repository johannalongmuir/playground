package adventofcode.dayTwo;

import adventofcode.FeatureHandler;
import adventofcode.Runner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayTwo implements Runner {

    private static final int NOUN_ADDRESS_ONE = 1;
    private static final int VERB_ADDRESS_TWO = 2;
    protected int GRAVITY_ASSIST_OUTPUT_ADDRESS_0 = 19690720;

    private String initialState;
    private List<Integer> intcodeList;


    protected List<Integer> intcodeComputer(String intcodeProgram) {
        initialState = intcodeProgram;

        splitInput(intcodeProgram);

        if (FeatureHandler.FEATURE_REVERSE) {
            gravityAssistOutputConvertToInputs(GRAVITY_ASSIST_OUTPUT_ADDRESS_0);
        } else {
            if (FeatureHandler.FEATURE_RESTORE_GRAVITY_ASSIST) {
                restoreGravityAssistProgramWith1202();
            }
            runIntcode();
        }
        return intcodeList;
    }





    protected void runIntcode() {
        for (int instructionPointer = 0; instructionPointer < intcodeList.size() ; instructionPointer += 4) {
            if (intcodeList.get(instructionPointer) == 99) {
                // if refactor instructionPointer out then with a 99 increase pointer by 1 but then exits anyway
                break;
            } else if (intcodeList.get(instructionPointer) == 1 || intcodeList.get(instructionPointer) == 2) {
                int addressOne = intcodeList.get(instructionPointer + NOUN_ADDRESS_ONE);
                int addressTwo = intcodeList.get(instructionPointer + VERB_ADDRESS_TWO);
                int replaceAt = intcodeList.get(instructionPointer + 3);
                int sum;

                if (intcodeList.get(instructionPointer) == 1) {
                    sum = intcodeList.get(addressOne) + intcodeList.get(addressTwo);
                    intcodeList.set(replaceAt, sum);
                } else if (intcodeList.get(instructionPointer) == 2) {
                    sum = intcodeList.get(addressOne) * intcodeList.get(addressTwo);
                    intcodeList.set(replaceAt, sum);
                }
            } else {
                System.err.println("Invalid Opcode at pointer " + instructionPointer);
            }
        }
    }











    protected void restoreGravityAssistProgramWith1202() {
      intcodeList.set(NOUN_ADDRESS_ONE, 12);
      intcodeList.set(VERB_ADDRESS_TWO, 2);
    }



    protected void gravityAssistOutputConvertToInputs(int resultAt0) {
        int maximumValue = 99;
        entryLoop: for (int noun = 0; noun <= maximumValue; noun++) {

            for (int verb = 0; verb <= maximumValue; verb++) {
                    intcodeList.set(NOUN_ADDRESS_ONE, noun);
                    intcodeList.set(VERB_ADDRESS_TWO, verb);
                    runIntcode();

                    if (intcodeList.get(0) == resultAt0) {
                        System.out.println(intcodeList.get(NOUN_ADDRESS_ONE));
                        System.out.println(intcodeList.get(VERB_ADDRESS_TWO));
                        break entryLoop;
                    } else {
                        resetIntcodeInput();
                    }
            }
        }
    }



    private void resetIntcodeInput () {
        intcodeList.clear();
        splitInput(initialState);
    }


    private void splitInput(String intcodeString) {
        intcodeList = Arrays.stream(intcodeString.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }



    @Override
    public String run(String inputFile) {
        return intcodeComputer(inputFile).get(0).toString();
    }

}

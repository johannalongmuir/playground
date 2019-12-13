package adventofcode.dayThree;

import adventofcode.Runner;

import java.util.ArrayList;

public class DayThree implements Runner {

    private String[] directions;
    private ArrayList<ArrayList<String>> position = new ArrayList<>();
    private Integer locationX = 0;
    private Integer locationY = 0;

    // list A, list off the coordinates for each step, e.g R2. |0,0|0,1|0,2|,
    // list B, list off the coordinates for each step.
    // then go through and check if double up in line A and B
    // get all doubles, calculate and which ever the lowest get rid of.


    private String getManhattanDistance(String inputFile) {
        splitInputsToDirectionArray(inputFile);
        plotDirection();
        printPosition();
        return "end";
    }



    private void plotDirection () {
        ArrayList<String> inputArray = new ArrayList<>();
        inputArray.add(" ");
        position.add(0, inputArray);


        for (String directionInstruction : directions) {
            char directionHeaded = directionInstruction.charAt(0);
            int numberOfSteps = Integer.parseInt(directionInstruction.substring(1));
            position.get(locationX).set(locationY, "+");
            positionExistCheck(directionHeaded, numberOfSteps);

            for (int i = 0; i < numberOfSteps; i++) {
                switch (directionHeaded) {
                    case 'R':
                        locationX++;
                        updateContentAtPosition("-");
                        break;
                    case 'L':
                        locationX--;
                        updateContentAtPosition("-");
                        break;
                    case 'U':
                        locationY++;
                        updateContentAtPosition("|");
                        break;
                    case 'D':
                        locationY--;
                        updateContentAtPosition("|");

                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }
        position.get(0).set(0, "O");
    }

    private void updateContentAtPosition(String lineInput) {
        if (position.get(locationX).get(locationY).equals(".")) {
            position.get(locationX).set(locationY, lineInput);
        } else if (position.get(locationX).get(locationY).equals("-") || position.get(locationX).get(locationY).equals("|")) {
            position.get(locationX).set(locationY, "X");
        } else {
            position.get(locationX).add(locationY, lineInput);
        }
    }


    private void positionExistCheck(char directionIndividual, int numberOfSteps) {
        int xPositionCheck = locationX;
        int yPositionCheck = locationY;
        for (int start = 0; start <= numberOfSteps; start++) {
            switch (directionIndividual) {
                case 'R':
                    xPositionCheck = locationX + start;
                    break;
                case 'L':
                    xPositionCheck = locationX - start;
                    break;
                case 'U':
                    yPositionCheck = locationY + start;
                    break;
                case 'D':
                    yPositionCheck = locationY - start;
                    break;
                default:
                    System.out.println("Error");
            }
            xAxisCheck(xPositionCheck);
            yAxisCheck(yPositionCheck, xPositionCheck);
        }
    }

    private void yAxisCheck(int yPositionCheck, int xPositionCheck) {
        if (yPositionCheck >= position.get(xPositionCheck).size()) {
            int startValue = position.get(xPositionCheck).size();
            for (int i = startValue; i <= yPositionCheck; i++) {
                position.get(xPositionCheck).add(".");
            }
        }
    }

    private void xAxisCheck(int xPositionCheck) {
        if (xPositionCheck >= position.size()) {
                ArrayList<String> dummy = new ArrayList<>();
                dummy.add(".");
                position.add(dummy);
        }
    }


    
    private void printPosition() {
        Integer maxYSize = 0;
        for (ArrayList<String> check : position) {
            if (check.size() > maxYSize) {
                maxYSize = check.size();
            }
        }

        for (int yAxis = 0; yAxis < maxYSize; yAxis++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int xAxis = 0; xAxis < position.size(); xAxis++) {
                if (position.get(xAxis).size() <= yAxis) {
                    for (int j = 0; j < yAxis; j++) {
                        position.get(xAxis).add(yAxis, ".");
                    }
                }
                stringBuilder.append(position.get(xAxis).get(yAxis));
            }
            System.out.println(stringBuilder);
        }

    }

    private void splitInputsToDirectionArray(String inputFile) {
        directions = inputFile.split(",");
    }



    @Override
    public String run(String inputFile) {
        return getManhattanDistance(inputFile);
    }
}

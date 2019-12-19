package com.manchesterdigital.messing;

public class CheckRemoveAllButBraces {

    public static void main(String[] args) {
        onlyBracketsSetup();
    }

    public static String onlyBracketsSetup() {
        String input = "public class DayThree implements Runner {\n" +
                "\n" +
                "    private String[] listAlistB;\n" +
                "    private String[] directions;\n" +
                "    private ArrayList<ArrayList<String>> position = new ArrayList<>();\n" +
                "    private ArrayList<List<String>> allLists = new ArrayList<>();\n" +
                "    private ArrayList<String> matchList = new ArrayList<>();\n" +
                "    private Integer locationX = 0;\n" +
                "    private Integer locationY = 0;\n" +
                "    private Integer maxYSize = 0;\n" +
                "    private Integer finalXAxisForCrossover;\n" +
                "    private Integer finalYAxisForCrossover;\n" +
                "    private Integer manhattanDistance = Integer.MAX_VALUE;\n" +
                "    int totalABListSteps = Integer.MAX_VALUE;\n" +
                "\n" +
                "    // list A, list off the coordinates for each step, e.g R2. |0,0|0,1|0,2|,\n" +
                "    // list B, list off the coordinates for each step.\n" +
                "    // then go through and check if double up in line A and B\n" +
                "    // get all doubles, calculate and which ever the lowest get rid of.\n" +
                "    \n" +
                "    private String getManhattanDistance(String inputFile) {\n" +
                "        if (inputFile.contains(\"\\n\")) {\n" +
                "            splitInputsToLines(inputFile);\n" +
                "            for (String a : listAlistB) {\n" +
                "                inputFile = listAlistB[0];\n" +
                "            }\n" +
                "        }\n" +
                "        if (FeatureHandler.SIMPLE_CHECK_ONLY) {\n" +
                "            justLineAAndBCrossoverCheck();\n" +
                "            filterForMatches();\n" +
                "            if(FeatureHandler.NUMBEROFSTEPSTOREACHMANHATTAN) {\n" +
                "                numberOfStepsCalculation();\n" +
                "                System.out.println(\"Lowest Total A/B Steps = \" + totalABListSteps);\n" +
                "            }\n" +
                "        } else {\n" +
                "            splitInputsToDirectionArray(inputFile);\n" +
                "            plotDirection();\n" +
                "            maxYSizeCheck();\n" +
                "            addEmptyPositionValues();\n" +
                "            if (FeatureHandler.FEATURE_NO_PRINT_PERIODS) {\n" +
                "                removePeriodsInAllArrays();\n" +
                "            }\n" +
                "            if (FeatureHandler.FEATURE_PRINT_GRID) {\n" +
                "                printPositionOnGrid();\n" +
                "            }\n" +
                "            checkCrossoverlocation();\n" +
                "        }\n" +
                "        System.out.println(\"ManhattanDistance coordinates = X: \" + finalXAxisForCrossover + \", Y: \" + finalYAxisForCrossover);\n" +
                "\n" +
                "        return manhattanDistance.toString();\n" +
                "    }\n" +
                "\n" +
                "    private void numberOfStepsCalculation() {\n" +
                "        for (String match : matchList) {\n" +
                "            int checkAB = 0;\n" +
                "            for (List<String> a : allLists) {\n" +
                "                System.out.println(\"Number of Steps\" + a.indexOf(match));\n" +
                "                checkAB += a.indexOf(match);\n" +
                "            }\n" +
                "            if(totalABListSteps > checkAB) {\n" +
                "                totalABListSteps = checkAB;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void filterForMatches() {\n" +
                "        outermost: for (int i = 0; i < allLists.size() - 1; i++) {\n" +
                "            middle: for (int j = 0; j < allLists.get(i).size(); j++) {\n" +
                "            if (allLists.get(i).get(j).contains(\"terminate\")) {\n" +
                "                        break middle;\n" +
                "            }\n" +
                "                inner: for (int k = 1; k < allLists.get(i+1).size(); k++) {\n" +
                "                    if (allLists.get(i).get(j).equals(allLists.get(i + 1).get(k))) {\n" +
                "                        if (allLists.get(i + 1).get(k).contains(\"terminate\")) {\n" +
                "                            break inner;\n" +
                "                        }\n" +
                "\n" +
                "                        matchList.add(allLists.get(i).get(j));\n" +
                "                        String toSplit = allLists.get(i).get(j).substring(1);\n" +
                "                        String [] axis = toSplit.split(\"Y\");\n" +
                "//                        System.out.println(Integer.parseInt(axis[0]));\n" +
                "//                        System.out.println(Integer.parseInt(axis[1]));\n" +
                "\n" +
                "                        closestValue(Integer.parseInt(axis[0]), Integer.parseInt(axis[1]));\n" +
                "\n" +
                "                    }\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "\n" +

                "    private void plotDirection () {\n" +
                "        ArrayList<String> inputArray = new ArrayList<>();\n" +
                "        inputArray.add(\" \");\n" +
                "        position.add(0, inputArray);\n" +
                "        for (String directionInstruction : directions) {\n" +
                "            char directionHeaded = directionInstruction.charAt(0);\n" +
                "            int numberOfSteps = Integer.parseInt(directionInstruction.substring(1));\n" +
                "            position.get(locationX).set(locationY, \"+\");\n" +
                "            positionExistCheck(directionHeaded, numberOfSteps);\n" +
                "            for (int i = 0; i < numberOfSteps; i++) {\n" +
                "                switch (directionHeaded) {\n" +
                "                    case 'R':\n" +
                "                        locationX++;\n" +
                "                        updateContentAtPosition(\"-\");\n" +
                "                        break;\n" +
                "                    case 'L':\n" +
                "                        locationX--;\n" +
                "                        updateContentAtPosition(\"-\");\n" +
                "                        break;\n" +
                "                    case 'U':\n" +
                "                        locationY++;\n" +
                "                        updateContentAtPosition(\"|\");\n" +
                "                        break;\n" +
                "                    case 'D':\n" +
                "                        locationY--;\n" +
                "                        updateContentAtPosition(\"|\");\n" +
                "\n" +
                "                        break;\n" +
                "                    default:\n" +
                "                        System.out.println(\"Error\");\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        position.get(0).set(0, \"O\");\n" +
                "        position.get(locationX).set(locationY, \"e\");\n" +
                "    }\n" +
                "\n" +
                "    private void positionExistCheck(char directionIndividual, int numberOfSteps) {\n" +
                "        int xPositionCheck = locationX;\n" +
                "        int yPositionCheck = locationY;\n" +
                "        for (int start = 0; start <= numberOfSteps; start++) {\n" +
                "            switch (directionIndividual) {\n" +
                "                case 'R':\n" +
                "                    xPositionCheck = locationX + start;\n" +
                "                    break;\n" +
                "                case 'L':\n" +
                "                    xPositionCheck = locationX - start;\n" +
                "                    break;\n" +
                "                case 'U':\n" +
                "                    yPositionCheck = locationY + start;\n" +
                "                    break;\n" +
                "                case 'D':\n" +
                "                    yPositionCheck = locationY - start;\n" +
                "                    break;\n" +
                "                default:\n" +
                "                    System.out.println(\"Error\");\n" +
                "            }\n" +
                "            xAxisCheck(xPositionCheck);\n" +
                "            yAxisCheck(yPositionCheck, xPositionCheck);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    private void xAxisCheck(int xPositionCheck) {\n" +
                "        if (xPositionCheck >= position.size()) {\n" +
                "            ArrayList<String> dummy = new ArrayList<>();\n" +
                "            dummy.add(\".\");\n" +
                "            position.add(dummy);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void yAxisCheck(int yPositionCheck, int xPositionCheck) {\n" +
                "        if (yPositionCheck >= position.get(xPositionCheck).size()) {\n" +
                "            int startValue = position.get(xPositionCheck).size();\n" +
                "            for (int i = startValue; i <= yPositionCheck; i++) {\n" +
                "                position.get(xPositionCheck).add(\".\");\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void updateContentAtPosition(String lineInput) {\n" +
                "        if (position.get(locationX).get(locationY).equals(\".\")) {\n" +
                "            position.get(locationX).set(locationY, lineInput);\n" +
                "        } else if (position.get(locationX).get(locationY).equals(\"-\") || position.get(locationX).get(locationY).equals(\"|\")) {\n" +
                "            position.get(locationX).set(locationY, \"X\");\n" +
                "        } else {\n" +
                "            position.get(locationX).add(locationY, lineInput);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void maxYSizeCheck(){\n" +
                "        for (ArrayList<String> check : position) {\n" +
                "            if (check.size() > maxYSize) {\n" +
                "                maxYSize = check.size();\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void addEmptyPositionValues() {\n" +
                "        for (int yAxis = 0; yAxis < maxYSize; yAxis++) {\n" +
                "            for (int xAxis = 0; xAxis < position.size(); xAxis++) {\n" +
                "                if (position.get(xAxis).size() <= yAxis) {\n" +
                "                    for (int j = 0; j < yAxis; j++) {\n" +
                "                        position.get(xAxis).add(yAxis, \".\");\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void removePeriodsInAllArrays() {\n" +
                "        for (ArrayList arrayList : position) {\n" +
                "            for (int i = 0; i < maxYSize; i++) {\n" +
                "                if (arrayList.get(i) == \".\"){\n" +
                "                    arrayList.set(i, \" \");\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void printPositionOnGrid() {\n" +
                "        for (int yAxis = 0; yAxis < maxYSize; yAxis++) {\n" +
                "            StringBuilder stringBuilder = new StringBuilder();\n" +
                "            for (int xAxis = 0; xAxis < position.size(); xAxis++) {\n" +
                "                stringBuilder.append(position.get(xAxis).get(yAxis));\n" +
                "            }\n" +
                "            System.out.println(stringBuilder);\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    private void checkCrossoverlocation() {\n" +
                "        // TODO this is not refactored to look at locations from lineA and lineB and compare as I have only plotted line A so far\n" +
                "        // TODO save all x + y positions to a crossover position grid for later;\n" +
                "        for (int xAxisForCrossover = 0; xAxisForCrossover < position.size(); xAxisForCrossover++) {\n" +
                "            for (int yAxisForCrossover = 0; yAxisForCrossover < maxYSize; yAxisForCrossover++) {\n" +
                "                if (position.get(xAxisForCrossover).get(yAxisForCrossover) == \"X\"){\n" +
                "                    closestValue(xAxisForCrossover, yAxisForCrossover);\n" +
                "                    System.out.println(\"All Crossover Positions = X: \" + xAxisForCrossover + \", Y: \" + yAxisForCrossover);\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void closestValue(int xAxisForCrossover, int yAxisForCrossover) {\n" +
                "        if (xAxisForCrossover + yAxisForCrossover < manhattanDistance){\n" +
                "            int xAxisNoNeg = xAxisForCrossover;\n" +
                "            int yAxisNoNeg = yAxisForCrossover;\n" +
                "            if (xAxisNoNeg < 0) {\n" +
                "                xAxisNoNeg = Math.abs(xAxisNoNeg);\n" +
                "            }\n" +
                "            if (yAxisNoNeg < 0 ){\n" +
                "                yAxisNoNeg = Math.abs(yAxisNoNeg);\n" +
                "            }\n" +
                "            manhattanDistance = xAxisNoNeg + yAxisNoNeg;\n" +
                "            finalXAxisForCrossover = xAxisForCrossover;\n" +
                "            finalYAxisForCrossover = yAxisForCrossover;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void justLineAAndBCrossoverCheck() {\n" +
                "        int xInt = 0;\n" +
                "        int yInt = 0;\n" +
                "        for (String inputString : listAlistB) {\n" +
                "            List<String> coordinates = new ArrayList<>();\n" +
                "            String[] tester = inputString.split(\",\");\n" +
                "            for (String directionCheck : tester) {\n" +
                "                char directionHeaded = directionCheck.charAt(0);\n" +
                "                int numberOfSteps = Integer.parseInt(directionCheck.substring(1));\n" +
                "                for (int i = 0; i < numberOfSteps; i++) {\n" +
                "                    coordinates.add(\"X\" + xInt + \"Y\" + yInt);\n" +
                "                    switch (directionHeaded) {\n" +
                "                        case 'R':\n" +
                "                            xInt += 1;\n" +
                "                            break;\n" +
                "                        case 'L':\n" +
                "                            xInt -= 1;\n" +
                "                            break;\n" +
                "                        case 'U':\n" +
                "                            yInt += 1;\n" +
                "                            break;\n" +
                "                        case 'D':\n" +
                "                            yInt -= 1;\n" +
                "                            break;\n" +
                "                        default:\n" +
                "                            System.out.println(\"Error\");\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "            xInt = 0;\n" +
                "            yInt = 0;\n" +
                "            coordinates.add(\"terminate\");\n" +
                "            allLists.add(coordinates);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String run(String inputFile) {\n" +
                "        return getManhattanDistance(inputFile);\n" +
                "    }\n" +

                "}\n";


        String test = input.replaceAll("[^{(})]", "");
        return test;

    }
}

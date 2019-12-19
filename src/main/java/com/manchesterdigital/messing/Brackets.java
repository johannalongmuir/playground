package com.manchesterdigital.messing;

public class Brackets {

    public static void main(String[] args) {
        String input = CheckRemoveAllButBraces.onlyBracketsSetup();
        findBracket(input);
    }

    private static void findBracket(String input) {
        String noBrackets = input.replaceAll("\\(\\)", "..");
        String noBraces = noBrackets.replaceAll("\\{\\}", "..");

        StringBuilder removedString = new StringBuilder(noBraces);


        long countClosingBracker = removedString.chars().filter(ch -> ch == ')').count();

        for (int i = 0; i < countClosingBracker; i++) {
            int closingBracket = removedString.indexOf(")");
            int findOpenBracket = closingBracket - 1;
            for (int j = 0; j < 50; j++) {
                char open = removedString.charAt(findOpenBracket);
                if (open == '.') {
                    --findOpenBracket;
                } else if (open == '{') {
                    System.out.println("Error");
                } else {
                    break;
                }
            }
            removedString.setCharAt(closingBracket, '.');
            removedString.setCharAt(findOpenBracket, '.');
        }

        System.out.println(removedString);

        long countClosingBrace= removedString.chars().filter(ch -> ch == '}').count();

        for (int i = 0; i < countClosingBrace; i++) {
            int closingBracket = removedString.indexOf("}");
            int findOpenBracket = closingBracket - 1;
            for (int j = 0; findOpenBracket >= 0; j++) {
                char open = removedString.charAt(findOpenBracket);
                if (open == '.') {
                    --findOpenBracket;
                } else if (open == '(') {
                    System.out.println("Error");
                } else {
                    break;
                }
            }
            removedString.setCharAt(closingBracket, '.');
            removedString.setCharAt(findOpenBracket, '.');
        }
        System.out.println(removedString);
        String check = removedString.toString().replaceAll("\\.", "");
        System.out.println(check);
        boolean result = check.length() == 0;

        System.out.println(result);

    }





//            for (int j = 0; j < 15; j++) {
                //int leftIndex = positionBegin;
                //int rightIndex = positionBegin;
//                char left = myString.charAt(leftIndex);
//                char right = myString.charAt(rightIndex);
//
//                for (int k = 0; k < myString.length(); k++) {
//                    if (right != ')') {
//                        if (right != '}') {
//                        ++rightIndex;
//                        right = myString.charAt(positionBegin + rightIndex);
//                        } else {
//                            break;
//                        }
//                    } else {
//                        break;
//                    }
//                }
//
//                for (int d = 0; d < myString.length(); d++) {
//                    if (left == '.') {
//                        --leftIndex;
//                        left = myString.charAt(positionBegin + leftIndex);
//                    } else {
//                        break;
//                    }
//                }
//
//
//                for (int e = 0; e < myString.length(); e++) {
//                    if (left == '.') {
//
//                    } else {
//                        break;
//                    }
//
//                }
//
//
//
//                if (left == '(' && right == ')') {
//                    myString.setCharAt(positionBegin + leftIndex, '.');
//                    myString.setCharAt(positionBegin + rightIndex, '.');
//                    --leftIndex;
//                    ++rightIndex;
//                } else if (left == '{' && right == '}') {
//                    myString.setCharAt(positionBegin + leftIndex, '.');
//                    myString.setCharAt(positionBegin + rightIndex, '.');
//                    --leftIndex;
//                    ++rightIndex;
//                } else {
//                    break;
//            }
//        }

        //System.out.println(myString);



    //}


    public static boolean isClosed(String input) {
        // To do, probably better going through until find the first } then work backwards on that section.
        // to start with needs to have start and end { ... }
        // take in code, remove everything that isn't () or {}
        // find first () or {}..change to T?
        // save index.
        // look one left, and one right.
        //  if () or {} ..change to T
        //  else if two openings (( or {{ , find next {} or ();
        //
        //

        boolean result = false;
        String inputBreakdown = input;
        for (int braceCounter = 0; braceCounter < input.length(); braceCounter++) {
            // first check is starts and ends with brackets.
            // Can also have {} brackets in the method so in that case wouldn't want to check the last one

            if (inputBreakdown.startsWith("{") && inputBreakdown.endsWith("}")) {
                inputBreakdown = inputBreakdown.substring(1, inputBreakdown.length() - 1);
                }
            if (inputBreakdown.startsWith("(")) {
                inputBreakdown = inputBreakdown.replaceFirst("\\)", "");
                inputBreakdown = inputBreakdown.substring(1);
            }
            if (inputBreakdown.length() == 0) {
                result = true;
            }
        }

        return result;
    }
}

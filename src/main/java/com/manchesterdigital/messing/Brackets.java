package com.manchesterdigital.messing;

public class Brackets {

    public static void main(String[] args) {
        //String input = CheckRemoveAllButBraces.onlyBracketsSetup();
        String input = "{()(({)(())){{}{}({})}}";
        findBracket(input);
    }

    private static void findBracket(String input) {
        String noBrackets = input;
        for (int i = 0; i < 10; i++) {
            if (noBrackets.contains("()")) {
                noBrackets = noBrackets.replaceAll("\\(\\)", "");
                //String noBraces = noBrackets.replaceAll("\\{}", "..");
                System.out.println(noBrackets);
            }
        }


        //String noBrackets = input.replaceAll("\\(\\)", "..");
        String noBraces = noBrackets.replaceAll("\\{}", "..");

        StringBuilder removedString = new StringBuilder(noBraces);

        boolean result = false;


        long countClosingBracker = removedString.chars().filter(ch -> ch == ')').count();

        mainLoop: for (int i = 0; i < countClosingBracker; i++) {
            int closingBracket = removedString.indexOf(")");
            int findOpenBracket = closingBracket - 1;
            for (int j = 0; j < 50; j++) {
                char open = removedString.charAt(findOpenBracket);
                if (open == '.') {
                    --findOpenBracket;
                } else if (open == '(') {
                    break;
                } else {
                    System.out.println("Opening bracket for ) at index " + closingBracket + " not found");
                    break mainLoop;
                }
            }
            removedString.setCharAt(closingBracket, '.');
            removedString.setCharAt(findOpenBracket, '.');
        }

        long countClosingBrace= removedString.chars().filter(ch -> ch == '}').count();

        if (removedString.toString().contains("(") || removedString.toString().contains(")")) {
            System.out.println("Out of bounds");
        } else  {
            outerLoop:
            for (int i = 0; i < countClosingBrace; i++) {
                int closingBracket = removedString.indexOf("}");
                int findOpenBracket = closingBracket - 1;
                for (int j = 0; findOpenBracket >= 0; j++) {
                    char open = removedString.charAt(findOpenBracket);
                    if (open == '.') {
                        --findOpenBracket;
                    } else if (open == '{') {
                        break;
                    } else {
                        System.out.println("Improper opening bracket for } at index" + closingBracket);
                        break outerLoop;
                    }
                }
                removedString.setCharAt(closingBracket, '.');
                removedString.setCharAt(findOpenBracket, '.');
            }
        }

        String check = removedString.toString().replaceAll("\\.", "");
        System.out.println(check);
        result = check.length() == 0;

        System.out.println(result);

    }
















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

package com.manchesterdigital.bootcamp.StringCalculatorTDDOnly;


public class StringExpression {

    public static String calculator(String wordInput) {

        // TODO refactor this whole thing
        int a = 0;
        int b = 0;
        int calculateResult;
        String output = " ";




        if (wordInput.contains("plus")) {
            calculateResult = a + b;
        } else if (wordInput.contains("minus")) {
            calculateResult = a - b;
        } else {
            System.out.println("Invalid operator");
        }



        // use calculate result and convert to string

        return output;
    }

}



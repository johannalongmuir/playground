package com.manchesterdigital.bootcamp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringExpressionTest {
    /*
    Write a program such that when given a string parameter, which will perform a mathematical operation and return the result, in words.
    Numbers 0-9 and the symbols "plus" and "minus" are the only inputs allowed in the single parameter the program recieves.
    For example:
    stringExpression( "onezeropluseight" ) -> "oneeight"
    stringExpression( "oneminusoneone" ) -> "negativeonezero"
     */


    @Test
    public void ifGiven0ReturnZero() {
        int number = 0;
        String result = StringExpression.toWords(number);
        Assertions.assertThat(result).isEqualToIgnoringCase("Zero");
    }

    @Test
    public void ifGiven1ReturnOne() {
        int number = 1;
        String result = StringExpression.toWords(number);
        Assertions.assertThat(result).isEqualToIgnoringCase("One");
    }

    @Test
    public void ifGiven2ReturnTwo() {
        int number = 2;
        String result = StringExpression.toWords(number);
        Assertions.assertThat(result).isEqualToIgnoringCase("Two");
    }
}

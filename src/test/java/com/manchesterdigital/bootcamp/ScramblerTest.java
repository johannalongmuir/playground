package com.manchesterdigital.bootcamp;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ScramblerTest {

    /*Given two strings, when passed a scrambled string,
    if passed a second one the method will return true if the second word contains all letters in the first.
    Such as
    scrambler(“cdoer”, “coder”) -> true
    scrambler(“hello”, “hkllo”) -> false
    */


    /*
        Looking at scrambler
        a + b .toLowerCase();

        alphabetise?
        then easier to iterate over?.
        for (
        char a [0] == char b [0]

        or set? tree set alphabetise?
        set compare?
        set differences...if none then is correct
         */


    @Test
    public void whenGivenTwoStringsOfSameLengthReturnTrue() {
        String a = "hello";
        String b = "hello";
        boolean result = Scrambler.sameLetters(a, b);
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void whenGivenTwoStringsOfDifferentLengthReturnFalse() {
        String a = "helloyou";
        String b = "hello";
        boolean result = Scrambler.sameLetters(a, b);
        Assertions.assertThat(result).isEqualTo(false);
    }


    @Test
    public void whenGivenTwoStringsAlphabetise() {
        String a = "helloyou";
        String b = "hello";
        boolean result = Scrambler.sameLetters(a, b);
        Assertions.assertThat(result).isEqualTo(false);
    }

}

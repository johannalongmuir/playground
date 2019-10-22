package com.manchesterdigital.bootcamp;

import jdk.jfr.DataAmount;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class NumbersInWords {
    public Map<WordsForNumbers, Integer> wordsForNumbersIntegerMap= Map.of(
            WordsForNumbers.ZERO, 0,
            WordsForNumbers.ONE, 1,
            WordsForNumbers.TWO, 2,
            WordsForNumbers.THREE, 3,
            WordsForNumbers.FOUR, 4,
            WordsForNumbers.FIVE, 5,
            WordsForNumbers.SIX, 6,
            WordsForNumbers.SEVEN, 7,
            WordsForNumbers.EIGHT, 8,
            WordsForNumbers.NINE, 9);

    public Map<WordsForNumbers, Integer> getWordsForNumbersIntegerMap() {
        return wordsForNumbersIntegerMap;
    }

    /*public static Map <WordsForNumbers, Integer> createSingletonMap (){
        return Collections.singletonMap(WordsForNumbers.ZERO, 0);
    }

     */

}


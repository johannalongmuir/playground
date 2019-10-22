package com.manchesterdigital.bootcamp;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArraySumTest {

    /*

    Array Sum
    Given an array of several arrays that each contain integers
    your goal is to write a function that will sum up all the numbers in all the arrays.
    For example, if the input is [[3, 2], [1], [4, 12]]
    Then your program should output 22 because 3 + 2 + 1 + 4 + 12 = 22. 
    */

    @Test
    public void arrayContainingOneArraysReturnsSum() {
        int [] array1 = {3, 2};
        List<int[]> arrayList = new ArrayList<>();
        arrayList.add(array1);

        int result = ArraySum.sum(arrayList);

        Assertions.assertThat(result).isEqualTo(5);
    }
    @Test
    public void arrayContainingArraysReturnsSumOfArrays() {
        int [] array1 = {3, 2};
        int [] array2 = {1};
        int [] array3 = {4, 12};
        List<int[]> arrayList = new ArrayList<>();
        arrayList.add(array1);
        arrayList.add(array2);
        arrayList.add(array3);

        int result = ArraySum.sum(arrayList);

       Assertions.assertThat(result).isEqualTo(22);
    }
}

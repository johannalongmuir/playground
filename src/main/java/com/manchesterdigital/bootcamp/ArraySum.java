package com.manchesterdigital.bootcamp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArraySum {
    public static int sum(List<int[]> arrayList) {

        int result = 0;
        for (int[] test : arrayList) {
            for (Integer i : test) {
                result += i;
            }
        }

        int myNumber;
        System.out.println("dd");
        return result;
    }
}

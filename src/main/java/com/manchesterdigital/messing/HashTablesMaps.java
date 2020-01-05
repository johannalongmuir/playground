package com.manchesterdigital.messing;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTablesMaps {

    public static void main(String[] args) {
        Map<String, Integer> mapOne = new HashMap<String, Integer>();
        mapOne.put("grapes", 10000);
        mapOne.put("apples", 500);
        mapOne.put("pears", 5);
        mapOne.put("appleshhh", 2);
        System.out.println(mapOne.get("grapes").toString());

        Map<String, Integer> mapTwo = new TreeMap<String, Integer>();

        mapTwo.put("grapes", 10000);
        mapTwo.put("apples", 500);
        mapTwo.put("pears", 5);
        mapTwo.put("appleshhh", 2);
        System.out.println(mapOne);
        System.out.println(mapTwo);


    }


}

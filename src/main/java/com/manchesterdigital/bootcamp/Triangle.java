package com.manchesterdigital.bootcamp;

public class Triangle {

    /*
    build triangle
         *           1
        ***          3
       *****         5
      *******        7
     *********       9
    ***********      11

  When given a base number, if odd, build a triangle
  11 base
  white space....- white space every time. e.g starts with 5, then 4, then 3 etc
  work out how many to start with as int base/2 round down.
  * one,
  *++ each round until hits base number
  <= base ; i++
      */


    public static void main(String[] args) {
        printTriangle(11); // 6 high
        printTriangle(23); // 12 high
        printTriangle(2); // Number must be odd
    }

    private static void printTriangle(int base){
        if (base % 2 == 1) {
            int whiteSpace = base/2;
            for (int i = 1; i <= base; i+=2) {
                StringBuilder printString = new StringBuilder();
                for (int j = whiteSpace; j <= whiteSpace && j >0; j--) {
                    printString.append(" ");
                }
                for (int j = 0; j < i; j++) {
                    printString.append("*");
                }
                System.out.println(printString);
                whiteSpace--;
            }
        } else {
            System.out.println("Number must be odd!");
        }
    }
}

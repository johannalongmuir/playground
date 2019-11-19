package com.manchesterdigital;

public class PromotionPrimitiveValues {
    public static void main(String[] args) {
        byte byteOne = 1;
        short shortOne = 1;
        int intOne = 1;
        long longOne = 1;
        float floatOne = 1.0f;
        double doubleOne  = 1.0;

        int i1 = byteOne + byteOne;
        int i = byteOne + shortOne;
        long l = intOne + longOne;
        float v = longOne + floatOne;
        double v1 = floatOne + doubleOne;
        double v2 = byteOne + doubleOne;


        // Strings same?
        String a = "johanna";
        String b = "johanna";

        if (a.equals(b)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }



    }


}

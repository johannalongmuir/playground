package com.manchesterdigital.bootcamp;

public class FundamentalsSevenForLoop {
        public static void main(String[] args) {
            System.out.println(stringTimes("Hi", 5));

        }

        public static String stringTimes(String str, int n) {
            String result = "";

            for (int i = 0; i < n; i++) {
                result = result + str;

            } return result;


        }

}

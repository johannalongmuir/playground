package adventofcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public enum FileEnumChecking {

    DAY_1("/Users/longmuirj/Documents/Practice/playground/playground/DataAdventOfCode/input_dayOne.txt");

    FileEnumChecking(String file) {
    }

    public static void main(String[] args) throws IOException {
        FileReader fr = null;{
            try {
                fr = new FileReader("/Users/longmuirj/Documents/Practice/playground/playground/DataAdventOfCode/input_dayOne.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        assert fr != null;
        BufferedReader br = new BufferedReader(fr);

        int i;


        while ((i=br.read())!=-1){
            System.out.print((char) i);
        }
          br.close();
          fr.close();

    }
    }

//    public void importFile() throws IOException {
//        FileReader fr = null;{
//            try {
//                fr = new FileReader(String.valueOf(DAY_1));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//        assert fr != null;
//        BufferedReader br = new BufferedReader(fr);
//
//        int i;
//
//
//        while ((i=br.read())!=-1){
//            System.out.print((char) i);
//        }
//          br.close();
//          fr.close();
//
//    }




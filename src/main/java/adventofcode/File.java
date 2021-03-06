package adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class File {
    //TODO add exceptions + try and catch for importing the file

    static final String DAY_1 = "/Users/longmuirj/Documents/Practice/playground/playground/DataAdventOfCode/input_dayOne.txt";
    static final String DAY_2 = "/Users/longmuirj/Documents/Practice/playground/playground/DataAdventOfCode/input_dayTwo.txt";
    static final String DAY_3 = "/Users/longmuirj/Documents/Practice/playground/playground/DataAdventOfCode/input_dayThree.txt";

    String importFile(String inputFile) throws IOException {
        StringBuilder returnString = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            int i;
            while ((i = br.read()) != -1) {
                returnString.append((char) i);
            }
            br.close();

        return returnString.toString();
    }
}

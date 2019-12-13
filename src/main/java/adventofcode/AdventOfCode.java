package adventofcode;

import adventofcode.dayThree.DayThree;
import adventofcode.dayTwo.DayTwo;

import java.io.IOException;

public class AdventOfCode {

/* Santa has become stranded at the edge of the Solar System while delivering presents to other planets!
    To accurately calculate his position in space, safely align his warp drive,
    and return to Earth in time to save Christmas, he needs you to bring him measurements from fifty stars.

    Collect stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar;
    the second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!

    R3,U06,L2,U1,R3,D5,R4,U3,R2,U1
    R3,U06,L2,D2,R4

    U147,R27,D10,R85,U199,R76,U311,R536,D930,R276,U589,L35
 */

    public static void main(String[] args) throws IOException {
        File file = new File();
        //String inputFile = file.importFile(File.DAY_3);
        //String inputFile = "R3,U06,L2,U1,R3,D5,R4,U3,R2,U1";
        String inputFile = "R93,U47,L80,U14,R27,D50,L18,D6,R90";
        Runner runner = new DayThree();
        System.out.println(runner.run(inputFile));
    }

}

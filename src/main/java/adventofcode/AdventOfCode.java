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
    Manhattan Distance Check = result is 9, X:7, Y:2 = input("R10,U012,L3,D2,R6,U4,R3,D6,L8,D1,R6,D5,L9,U2,R2,D3");

    U147,R27,D10,R85,U199,R76,U311,R536,D930,R276,U589,L35

 */

    public static void main(String[] args) throws IOException {
        File file = new File();
        //String inputFile = file.importFile(File.DAY_3);
//        String inputFile = "R93,U47,L80,U14,R27,D50,L18,D6,R90,U14,L25,D6,R19";
//       String inputFile = "R10,U013,L3,D2,R6,U4,R3,D6,L9,D2,R6,D3,L10,U2,R2,D4\nR5";
//       String inputFile = "R4,U7,R24,D7,L25";
//       String inputFile = "R4,U8,R7,D4,L11,U2,R20,D6";
       String inputFile = "R2,U2,R2,D6,R2,D3,L6,U4";
        Runner runner = new DayThree();
        System.out.println(runner.run(inputFile));
    }

}

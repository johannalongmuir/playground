package adventofcode;

import adventofcode.dayTwo.DayTwo;

import java.io.IOException;

public class AdventOfCode {

/* Santa has become stranded at the edge of the Solar System while delivering presents to other planets!
    To accurately calculate his position in space, safely align his warp drive,
    and return to Earth in time to save Christmas, he needs you to bring him measurements from fifty stars.

    Collect stars by solving puzzles. Two puzzles will be made available on each day in the Advent calendar;
    the second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!

 */

    public static void main(String[] args) throws IOException {
        File file = new File();
        StringBuilder inputFile = file.importFile(File.DAY_2);
        Runner runner = new DayTwo();
        System.out.println(runner.run(inputFile));
    }

}
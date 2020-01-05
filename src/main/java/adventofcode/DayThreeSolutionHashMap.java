package adventofcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class DayThreeSolutionHashMap {

    // need to add file to command line with this.
    //public static BufferedReader readFile = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedReader readFile;
    static {
        try {
            readFile = new BufferedReader(new FileReader(File.DAY_3));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //returns direction coords given For {L,R,U,D}
    public static int[] getDirectionCoordinates(char firstLetterDirection) {
        switch (firstLetterDirection) {
            case 'U': return new int[] {0,1};
            case 'D': return new int[] {0,-1};
            case 'L': return new int[] {-1,0};
            case 'R': return new int[] {1,0};
        }
        return null;
    }

    public static void main(String[] args) throws Exception {

        Map<String, Integer> wireOne = new HashMap<>();
        String[] input = readFile.readLine().split(",");

        int closestDistance = Integer.MAX_VALUE;
        int shortestWire = Integer.MAX_VALUE;

        int xCoords = 0, yCoords = 0, valueForMap = 0;

        for (String s : input) {
            int[] directionSteps = getDirectionCoordinates(s.charAt(0));
            int steps = Integer.parseInt(s.substring(1));
            for (int j = 0; j < steps; j++) {
                assert directionSteps != null;
                int newX = xCoords + directionSteps[0];
                int newY = yCoords + directionSteps[1];
                wireOne.put(newX + "_" + newY, ++valueForMap);
                xCoords = newX;
                yCoords = newY;
            }
        }
        input = readFile.readLine().split(",");
        xCoords = yCoords = valueForMap = 0;
        for (String s : input) {
            int[] directionSteps = getDirectionCoordinates(s.charAt(0));
            int len = Integer.parseInt(s.substring(1));
            for (int j = 0; j < len; j++) {
                assert directionSteps != null;
                int newX = xCoords + directionSteps[0];
                int newY = yCoords + directionSteps[1];
                valueForMap++;

                if (wireOne.containsKey(newX + "_" + newY)) { // is that location in wire one contained in wire 2
                    closestDistance = Math.min(closestDistance, Math.abs(newX) + Math.abs(newY)); // Part 1
                    shortestWire = Math.min(shortestWire, wireOne.get(newX + "_" + newY) + valueForMap); // part 2
                }
                xCoords = newX; // ready for next step.
                yCoords = newY; // ready for next step.
            }
        }
        System.out.println(closestDistance); // part One
        System.out.println(shortestWire); // part Two
    }
}


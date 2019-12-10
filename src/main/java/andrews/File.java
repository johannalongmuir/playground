package andrews;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public enum File {


        DAY1_1("/Users/longmuirj/Documents/Practice/playground/playground/DataAdventOfCode/input_dayOne.txt");

    String file;

    File(String file) {
        this.file = file;
    }

    public Stream<String> importFile() {
        Stream<String> lines = Stream.empty();
        try {
            Path path = Paths.get(file);
            lines = Files.lines(path);
        }catch(IOException e) {
            e.printStackTrace();
        }
        return lines;
    }



}

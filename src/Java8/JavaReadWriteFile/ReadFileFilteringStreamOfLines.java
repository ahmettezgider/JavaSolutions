package Java8.JavaReadWriteFile;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class ReadFileFilteringStreamOfLines {
    public static void main(String[] args) {
        Path filePath = Paths.get("d:/", "test.txt");

        try (Stream<String> lines = Files.lines(filePath)) {
            List<String> filteredLines = lines
                    .filter(s -> s.contains("password"))
                    .collect(Collectors.toList());

            filteredLines.forEach(System.out::println);

        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }
}

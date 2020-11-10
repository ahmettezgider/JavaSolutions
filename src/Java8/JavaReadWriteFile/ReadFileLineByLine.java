package Java8.JavaReadWriteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        Path filePath = Paths.get("d:/", "test.txt");

        //try-with-resources
        try (Stream<String> lines = Files.lines( filePath ))
        {
            lines.forEach(System.out::println);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

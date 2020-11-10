package Java8.JavaReadWriteFile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFileUsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        //Get the file reference
        Path path = Paths.get("d:/testout.txt");

        //Use try-with-resource to get auto-closeable writer instance
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Hello World !!");
        }
    }
}

package Java8.JavaReadWriteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFileUsingFilesWrite {
    public static void main(String[] args) throws IOException {
        String content = "Hello World !!";

        Files.write(Paths.get("d:/testout.txt"), content.getBytes());
    }
}

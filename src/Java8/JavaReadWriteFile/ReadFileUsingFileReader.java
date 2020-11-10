package Java8.JavaReadWriteFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

    public static void main(String[] args) throws IOException {
        readLinesUsingFileReader();
    }

    private static void readLinesUsingFileReader() throws IOException {
        File file = new File("d:/test.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine()) != null) {
            if(line.contains("password")){
                System.out.println(line);
            }
        }
        br.close();
        fr.close();
    }
}

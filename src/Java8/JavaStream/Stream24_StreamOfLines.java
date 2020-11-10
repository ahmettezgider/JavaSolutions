package Java8.JavaStream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream24_StreamOfLines {
    public static void main(String[] args) throws IOException {
        //--------------------------------------------------------------------
        //read file – line by line
        Path filePath1 = Paths.get("c:/temp", "data.txt");

        //try-with-resources
        try (Stream<String> lines = Files.lines( filePath1 ))
        {
            lines.forEach(System.out::println);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }





        //--------------------------------------------------------------------
        //read file – filtering stream of lines
        Path filePath2 = Paths.get("c:/temp", "data.txt");

        try (Stream<String> lines = Files.lines(filePath2))
        {

            List<String> filteredLines = lines
                    .filter(s -> s.contains("password"))
                    .collect(Collectors.toList());

            filteredLines.forEach(System.out::println);

        }
        catch (IOException e) {

            e.printStackTrace();
        }


        //--------------------------------------------------------------------
        //Java 7 – Read file using FileReader
        File file = new File("c:/temp/data.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine()) != null)
        {
            if(line.contains("password")){
                System.out.println(line);
            }
        }
        br.close();
        fr.close();

    }
}

package Java8.JavaRegexJoin;


import java.time.ZoneId;

public class JavaStringJoin {

    public static void main(String[] args){
        String joined = String.join("/","usr","local","bin");
        System.out.println(joined);

        //String ids = String.join(",", ZoneId.getAvailableZoneIds());
        String ids = String.join("\n", ZoneId.getAvailableZoneIds());
        System.out.println(ids);
    }
}

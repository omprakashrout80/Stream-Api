package Stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringContainsLetter {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Hari","Ram","Mike","Adi");
        List<String> newWords=words.stream().filter(i->i.contains("a")).collect(Collectors.toList());
        System.out.println(newWords);
    }
}

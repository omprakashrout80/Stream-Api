package STRAMapiPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
        List<String> data= Arrays.asList("Mike","Harry","Adi");
        List<String> newData=data.stream().filter(i->i.contains("a")).collect(Collectors.toList());
        System.out.println(newData);
    }
}

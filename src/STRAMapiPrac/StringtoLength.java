package STRAMapiPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringtoLength {
    public static void main(String[] args) {
        List<String> data= Arrays.asList("mike","harry","stalline");
        List<Integer> data1=data.stream().map(i->i.length()).collect(Collectors.toList());
        System.out.println(data1);

    }
}

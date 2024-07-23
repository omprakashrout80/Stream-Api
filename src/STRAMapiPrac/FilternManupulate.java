package STRAMapiPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilternManupulate {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,4,7,8,4,9);
        List<Integer> newData=data.stream().filter(i->i>4).map(i->i*i).collect(Collectors.toList());
        System.out.println(newData);
    }
}

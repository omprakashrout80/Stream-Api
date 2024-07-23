package Stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEvenOrOddNumber {

    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,2,3,4,5,6,7,8);
       // List<Integer> newData = data.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> newData=data.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(newData);
    }

}

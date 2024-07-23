package Stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDistinct {
    public static void main(String[] args) {
        List<Integer> array= Arrays.asList(1,2,4,56,62,1,2,4,56,4,7,8,2);
        List<Integer> newArray=array.stream().filter(i->i%2==0).sorted().distinct().collect(Collectors.toList());
        System.out.println(newArray);
    }

}

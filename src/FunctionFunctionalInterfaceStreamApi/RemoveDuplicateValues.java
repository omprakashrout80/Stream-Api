package FunctionFunctionalInterfaceStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateValues {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,23,2,2,1,23,4,23,7,1);
        List<Integer> newData=data.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(newData);
    }
}

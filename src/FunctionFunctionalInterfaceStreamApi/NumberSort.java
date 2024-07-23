package FunctionFunctionalInterfaceStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSort {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,3,53,775,33,7,4,3,7,8,65,88,23);
        List<Integer> newData=data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);
    }
}

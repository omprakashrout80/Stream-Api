package FunctionFunctionalInterfaceStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,2,3,4,5);
        //map used for manipulation of data and it  uses function functional Interface
        List<Integer> newData=data.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newData);

    }
}

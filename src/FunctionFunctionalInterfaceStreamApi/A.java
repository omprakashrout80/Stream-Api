package FunctionFunctionalInterfaceStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,2,3,4,5,69);
        List<Integer>newData=data.stream().map(k->k*k).collect(Collectors.toList());
        System.out.println(newData);
    }
}

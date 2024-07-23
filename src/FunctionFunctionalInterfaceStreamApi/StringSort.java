package FunctionFunctionalInterfaceStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {
    public static void main(String[] args) {
        List<String> data= Arrays.asList("Stallin","Adam","Mike","Hari");
        List<String> newData=data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);

    }
}

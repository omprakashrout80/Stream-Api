package FunctionFunctionalInterfaceStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToLowerCase {
    public static void main(String[] args) {
        List<String> data= Arrays.asList("HARI","RAM","GOPAL","SAM");
        List<String> newData=data.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
        System.out.println(newData);
    }
}

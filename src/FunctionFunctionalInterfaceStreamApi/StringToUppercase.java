package FunctionFunctionalInterfaceStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUppercase {
    public static void main(String[] args) {
        List<String> data= Arrays.asList("stallin","hari","gopal","ram");
        //map is used because we are manipulating the data from uppercase to lowercase
        List<String> newdata=data.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(newdata);
    }
}

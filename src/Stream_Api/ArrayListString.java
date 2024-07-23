package Stream_Api;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListString {
    public static void main(String[] args) {
        List<String> array= Arrays.asList("Sam","Ram","Hari","Sonu","Gopal","Sinu");
        List<String> newArray=array.stream().filter(i->i.startsWith("S")).collect(Collectors.toList());
        System.out.println(newArray);
    }
}

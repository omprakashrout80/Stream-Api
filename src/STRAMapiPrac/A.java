package STRAMapiPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Integer> salary= Arrays.asList(1000,3000,4500,5000);
        List<Integer> newSalary=salary.stream().filter(i->i>4000).collect(Collectors.toList());
        System.out.println(newSalary);
    }
}

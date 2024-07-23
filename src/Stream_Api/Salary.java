package Stream_Api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Salary {
    public static void main(String[] args) {
        List<Integer> salary= Arrays.asList(1000,5000,4500,2000);
        List<Integer> salaryAbove4000=salary.stream().filter(a->a>4000).collect(Collectors.toList());
        System.out.println(salaryAbove4000);
    }
}

package Predicate_Functionality;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> val=x->x>3;
        boolean result = val.test(11);
        System.out.println(result);
    }
}

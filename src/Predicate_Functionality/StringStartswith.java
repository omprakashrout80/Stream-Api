package Predicate_Functionality;

import java.util.function.Predicate;

public class StringStartswith {
    public static void main(String[] args) {
        Predicate<String> x=i->i.startsWith("a");
        boolean result = x.test("aditya");
       // boolean result=x.test("Hari");
        System.out.println(result);
    }
}

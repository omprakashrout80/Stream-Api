package Predicate_Functionality;

import java.util.function.Predicate;

public class StringLength {
    public static void main(String[] args) {
        Predicate<String> x = i->i.length()<=4;
        boolean result=x.test("Om Prakash");
        System.out.println(result);
    }
}

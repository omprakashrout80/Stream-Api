package Predicate_Functionality;

import java.util.function.Predicate;

public class OddEven {
    public static void main(String[] args) {
        Predicate<Integer> a=i->i%2==0;
        boolean result = a.test(3);
       // boolean result = a.test(12);
        if(result){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}

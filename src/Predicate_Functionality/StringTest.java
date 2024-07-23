package Predicate_Functionality;

import java.util.function.Predicate;

public class StringTest {
    public static void main(String[] args) {
        Predicate<String> x=i->i.equals("mike");
        //boolean result = x.test("mike");
        boolean result = x.test("john");
        if(result){
            System.out.println("Name is Correct");
        }else{
            System.out.println("Name is Not Correct");
        }

    }
}

package FunctionFunctionalInterface;

import java.util.function.Function;

public class SecondInput {
    public static void main(String[] args) {
        Function<Integer,String> val=b->"Val:"+b;
        String res=val.apply(69);
        System.out.println(res);
    }
}

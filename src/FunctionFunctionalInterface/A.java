package FunctionFunctionalInterface;

import java.util.function.Function;

//Defination( Function Functional Interface)-it takes an input and produces an output.

public class A {
    public static void main(String[] args) {
        Function<Integer,Integer> val=i->i*20;
        Integer res=val.apply(9);
        System.out.println(res);

    }
}

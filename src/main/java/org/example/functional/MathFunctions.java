package org.example.functional;

import java.util.function.Function;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        };
        System.out.println(square.apply(5));
        System.out.println(square.apply(25));
    }
}

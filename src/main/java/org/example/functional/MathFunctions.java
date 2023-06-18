package org.example.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        // Using Function
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        };
        System.out.println("---- FUNCTION ----");
        System.out.println(square.apply(5));
        System.out.println(square.apply(25));

        // Alternative for declare a function using Predicate
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println("---- PREDICATE ----");
        System.out.println(isOdd.apply(2));
        System.out.println(isEven.test(4));

        // Student example
        System.out.println("---- STUDENT EXAMPLE ----");

        Predicate<Student> isApproved = student -> student.getGrade() >= 6.0;

        Student Edwin = new Student(7.0);
        System.out.println(isApproved.test(Edwin));
    }

    // Example of use
    static class Student {
        private double grade;

        public Student(double grade) {
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }
    }
}

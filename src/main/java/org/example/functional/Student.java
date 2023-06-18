package org.example.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Student {
    private static List<Student> students = new ArrayList<Student>();
    static void save(Student student) {
        Consumer<Student> persist = student1 -> {
            students.add(student1);
        };
        persist.accept(student);
    }

    static String generateStrongPassword() {
        Supplier<String> passwordGenerator = () -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                result.append((char) (Math.random() * 26 + 97));
            }
            return result.toString();
        };
        return passwordGenerator.get();
    }

    static List<Student> findAll() {
        return students;
    }
}

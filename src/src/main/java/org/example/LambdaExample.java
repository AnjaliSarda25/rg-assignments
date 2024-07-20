package org.example;
import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // Using a lambda expression
        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(words);

        // Without using a lambda expression
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println(words);
    }
}


package org.example;
interface MathUtils {
    // Static method
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        int result = MathUtils.add(5, 3);
        System.out.println(result);
    }
}
package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {
    private static Map<Integer, String> userDatabase = new HashMap<>();

    static {
        userDatabase.put(1, "Anjali");
        userDatabase.put(2, "Sarda");
    }
    public static Optional<String> findUserById(int id) {
        return Optional.ofNullable(userDatabase.get(id));
    }

    public static void main(String[] args) {
        Optional<String> user1 = findUserById(1);
        user1.ifPresent(user -> System.out.println("User found: " + user));
        System.out.println("User found: " + user1.orElse("User not found"));

        Optional<String> user2 = findUserById(3);
        user2.ifPresent(user -> System.out.println("User found: " + user));
        System.out.println("User found: " + user2.orElse("User not found"));
    }
}

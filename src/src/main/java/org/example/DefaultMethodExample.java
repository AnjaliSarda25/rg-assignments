package org.example;
interface Animal {
    // Abstract method
    void makeSound();

    // Default method
    default void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}
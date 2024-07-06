package src;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton pattern initiated");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Hello World!!");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.display();
    }
}


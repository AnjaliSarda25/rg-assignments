package src;

public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
class main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Anjali"); //
        System.out.println(person.getName());
//        System.out.println(person.name()); // will give error
    }
}

package JavaProjectFromUdemy.lesson11;

public class User extends Object {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
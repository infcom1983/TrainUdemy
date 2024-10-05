package JavaProjectFromUdemy.lesson14.model;

public class User extends BaseObject {
    private String name;
    private int age;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "My name is " + name + ". I am " + age + " yers old.";
    }
}


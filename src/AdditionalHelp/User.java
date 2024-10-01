package AdditionalHelp;

public class User {
    String name;
    short age;
    int height;

    public User(String name, short age, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User(String name, int height, short age){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User(short age, String name, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User(short age, int height, String name){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User(int height, String name, short age){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User(int height, short age, String name){
        this.age = age;
        this.name = name;
        this.height = height;
    }


    public static void main(String[] args) {

    }
}

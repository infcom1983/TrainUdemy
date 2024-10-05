package JavaProjectFromUdemy.lesson14;

import JavaProjectFromUdemy.lesson11.User;
import JavaProjectFromUdemy.lesson14.example.Example1;
import JavaProjectFromUdemy.lesson14.example.Example2;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();
        System.out.println("-------------------------");

        Example1<User> example1 = new Example1<>();
        System.out.println(example1.get());
        example1.set(new User("Alex", 30));
        System.out.println(example1.get());
        System.out.println("--------------------------");

        Example2<User> example2 = Example2.init(new User());
        example2.set(new User("Alex", 30));
        System.out.println(example2.getInstance());
        System.out.println("--------------------------");
    }
}

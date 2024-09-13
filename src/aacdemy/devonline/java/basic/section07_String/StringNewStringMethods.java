package aacdemy.devonline.java.basic.section07_String;

import java.util.Arrays;

public class StringNewStringMethods {
    public static void main(String[] args) {
        String s = "  hello world  ";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.repeat(2));
        System.out.println(s.replace('l', 'j'));
        System.out.println(s.replace("hello", "Bye, Bye"));

        System.out.println(s.substring(5));
        System.out.println(s.substring(0, 5));

        System.out.println(Arrays.toString(s.split(" ")));

        System.out.println(s.trim());
        System.out.println(s.strip());
    }
}

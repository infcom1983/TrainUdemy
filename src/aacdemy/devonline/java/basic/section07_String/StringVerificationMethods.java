package aacdemy.devonline.java.basic.section07_String;

public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello world!";

        System.out.println(s.contains("world"));
        System.out.println(s.contains("World"));

        System.out.println(s.indexOf('o'));
        System.out.println(s.lastIndexOf('o'));

        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("world!"));

        System.out.println(s.isEmpty());
    }
}

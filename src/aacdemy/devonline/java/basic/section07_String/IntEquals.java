package aacdemy.devonline.java.basic.section07_String;

public class IntEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "h" + s1.substring(1);

        if (s1.equals(s2)) {
            System.out.println("s1 = s2");
        }
    }
}

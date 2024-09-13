package aacdemy.devonline.java.basic.section07_String;

import java.util.Arrays;

public class StringBasicMethods {
    public static void main(String[] args) {
        String s = "hello";

        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(Arrays.toString(s.toCharArray()));
    }
}

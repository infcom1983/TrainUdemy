package aacdemy.devonline.java.basic.section2_structure;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Whats your name?");
        var userName = new Scanner(System.in).nextLine();

        var result = "Hello " + userName;
        System.out.println(result);
    }
}

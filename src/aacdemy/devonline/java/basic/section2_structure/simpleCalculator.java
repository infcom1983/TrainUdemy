package aacdemy.devonline.java.basic.section2_structure;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter credentials");
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        var result = a + b;

        System.out.println(result);
    }
}

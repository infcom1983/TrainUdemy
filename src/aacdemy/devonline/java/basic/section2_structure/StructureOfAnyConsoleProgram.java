package aacdemy.devonline.java.basic.section2_structure;

import java.util.Scanner;

public class StructureOfAnyConsoleProgram {
    public static void main(String[] args) {
        System.out.println("Plese Enter the number");
        var number = new Scanner(System.in).nextInt();

        var result = number + 1;
        System.out.println(result);
    }
}

package aacdemy.devonline.java.basic.section07_String;

import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter cmd: {pi, e, exit or quit}");
            String cmd = new Scanner(System.in).nextLine();

            if (cmd.equals("pi")) {
                System.out.println("PI = " + Math.PI);
            } else if (cmd.equals("e")) {
                System.out.println("e = " + Math.E);
            } else if (cmd.equals("quit") || cmd.equals("exit")) {
                break;
            } else {
                System.out.println("Не понимаю что вы имеете в виду");
            }
        }
    }
}

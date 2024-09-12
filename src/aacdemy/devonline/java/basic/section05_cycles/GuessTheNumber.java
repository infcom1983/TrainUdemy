package aacdemy.devonline.java.basic.section05_cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);

        while (true) {
            var userNumber = new Scanner(System.in).nextInt();

            if (number > userNumber) {
                System.out.println("Number > " + userNumber + "Try again");
            } else if (number < userNumber) {
                System.out.println("Number < " + userNumber + "Try again");
            } else {
                System.out.println("Cong you guessed the Number");
                break;
            }

        }
    }
}



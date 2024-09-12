package aacdemy.devonline.java.basic.section05_cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberLimit {
    public static void main(String[] args) {

        var number = new Random().nextInt(10);

        var guessed = false;
        for (int i = 0; i < 10; i++) {
            var userCase = new Scanner(System.in).nextInt();
            if (number > userCase) {
                System.out.println("number > " + userCase + ". Try again: ");
            } else if (number < userCase) {
                System.out.println("number < " + userCase + ". Try again: ");
            } else {
                guessed = true;
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
        if (!guessed) {
            System.out.println("Limit reached");
        }
    }
}

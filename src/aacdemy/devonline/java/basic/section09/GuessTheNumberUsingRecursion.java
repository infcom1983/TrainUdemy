package aacdemy.devonline.java.basic.section09;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUsingRecursion {
    public static void main(String[] args) {


        guessNumberIterative();
        guessNumberRecursive();
    }

    private static void guessNumberIterative() {

        while (true) {
            var number = new Random().nextInt(10);
            var userCase = new Scanner(System.in).nextInt();

            if (number > userCase) {
                System.out.println("number > " + userCase + ". Try again:");
            } else if (number < userCase) {
                System.out.println("number < " + userCase + ". Try again");
            } else {
                System.out.println("Congratuletions, you guessed the number!");
                break;
            }
        }
    }

    private static void guessNumberRecursive() {
        var number = new Random().nextInt(10);
        var userCase = new Scanner(System.in).nextInt();

        if (number > userCase) {
            System.out.println("number > " + userCase + ". Try again:");
            guessNumberRecursive();
        } else if (number < userCase) {
            System.out.println("number < " + userCase + ". Try again");
            guessNumberRecursive();
        } else {
            System.out.println("Congratuletions, you guessed the number!");

        }
    }
}

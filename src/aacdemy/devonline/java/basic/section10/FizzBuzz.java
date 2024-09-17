package aacdemy.devonline.java.basic.section10;

public class FizzBuzz {
    public static void main(String[] args) {
        var from = 1;
        var to = 100;
        var isThree = 3;
        var isFive = 5;

        for (var i = from; i <= to; i++) {
            if (i % isThree == 0 && i % isFive == 0) {
                System.out.println("FizzBuzz");
            } else if (i % isThree == 0) {
                System.out.println("Fizz");
            } else if (i % isFive == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


    }
}

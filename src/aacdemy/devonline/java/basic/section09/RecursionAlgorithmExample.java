package aacdemy.devonline.java.basic.section09;

public class RecursionAlgorithmExample {
    public static void main(String[] args) {
        printNumbersFrom1To10();
        printNumbersFromAndTo10(1);
    }

/*    private static void printNumbersFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }*/

    private static void printNumbersFrom1To10() {
        int i = 1;
        while (true) {
            if (i > 10) {
                break;
            }
            System.out.print(i + "\t");
            i++;
        }
        System.out.println();
    }

    private static void printNumbersFromAndTo10(int i) {
        if (i > 10) {
            System.out.println();
        } else {
            System.out.print(i + "\t");
            printNumbersFromAndTo10(i + 1);
        }
    }


}

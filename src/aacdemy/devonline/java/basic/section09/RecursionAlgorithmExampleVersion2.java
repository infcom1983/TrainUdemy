package aacdemy.devonline.java.basic.section09;

public class RecursionAlgorithmExampleVersion2 {
    public static void main(String[] args) {
        printNumbersFromAndTo10(1);
        printNumbersFrom1AndTo(10);
    }

    private static void printNumbersFromAndTo10(int i) {
        if (i > 10) {
            System.out.println();
        } else {
            System.out.print(i + "\t");
            printNumbersFromAndTo10(i + 1);
        }
    }

    private static void printNumbersFrom1AndTo(int i) {
        printNumbersFrom1AndTo(i, i);
    }

    private static void printNumbersFrom1AndTo(int i, int to) {
        if (i != 0) {
            printNumbersFrom1AndTo(i - 1, to);
            System.out.print(i + "\t");
            if (i == 10) {
                System.out.println();
            }
        }
    }
}

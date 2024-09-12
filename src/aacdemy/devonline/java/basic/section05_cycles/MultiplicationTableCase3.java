package aacdemy.devonline.java.basic.section05_cycles;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        var to = 9;
        var cols = 4;
/*        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 2; i <= to; i++) {
            for (int j = 6; j <= to; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }*/

        for (int r = 2; r <= to; r += cols) {
            for (int i = 2; i <= to; i++) {
                for (int j = r; j < r + cols && j <= to; j++) {
                    System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

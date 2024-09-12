package aacdemy.devonline.java.basic.section05_cycles;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i >= 3 && i <= 6) {
                continue;
            }
            System.out.println(i + " ");
        }
        System.out.println();
    }
}

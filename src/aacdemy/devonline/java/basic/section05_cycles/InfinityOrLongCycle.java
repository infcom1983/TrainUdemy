package aacdemy.devonline.java.basic.section05_cycles;

public class InfinityOrLongCycle {
    public static void main(String[] args) {
        long time = System.nanoTime();

        for (int i = 0; i < 1_000_000_000; i++) {
            System.currentTimeMillis();

            if (i % 1_000_000 == 0) {
                System.out.println(i);
            }
        }

        long result = System.nanoTime() - time;
        System.out.println((double) result / 1_000_000_000 + " seconds");
    }
}

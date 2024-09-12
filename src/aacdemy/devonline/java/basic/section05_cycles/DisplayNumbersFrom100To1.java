package aacdemy.devonline.java.basic.section05_cycles;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        var from = 100;
        var to = 70;
        var step = 1;

        for (int i = from; i >= to; i -= step) {
            System.out.println(i);
        }
    }
}

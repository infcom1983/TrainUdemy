package aacdemy.devonline.java.basic.section05_cycles;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        var from = 2;
        var to = 50;
        var step = 2;

        for (var i = from; i <= to; i += step) {
            System.out.println(i);
        }
    }
}

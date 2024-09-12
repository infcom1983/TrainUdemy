package aacdemy.devonline.java.basic.section05_cycles;

public class WhileVersion {
    public static void main(String[] args) {

            var from = 100;
            var to = 1;
            var step = 1;

            var i = from;
            while (i >= to) {
                System.out.print(i + " ");
                i -= step;
            }
            System.out.println();


            var from1 = 0;
            var to1 = 50;
            var step1 = 2;

            var j = from1;
            while (j <= to1) ;
            System.out.print(j + " ");
            j += step1;

        System.out.println();
    }
}

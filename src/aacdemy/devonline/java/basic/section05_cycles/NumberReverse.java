package aacdemy.devonline.java.basic.section05_cycles;

public class NumberReverse {
    public static void main(String[] args) {
        var number = 674534521;

        var result = 0;
        var temp = number;
        while (temp != 0) {
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;
        }
        System.out.println(result);
    }
}

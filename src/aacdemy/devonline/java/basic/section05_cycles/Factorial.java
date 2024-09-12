package aacdemy.devonline.java.basic.section05_cycles;

public class Factorial {
    public static void main(String[] args) {

        var value = -5;

        String finalResult;
        if (value < 0) {
            finalResult = "Value should be >= 0";
        } else {
            var result = 1;
            for (var i = 1; i <= value; i++) {
                var oldResult = result;
                result *= i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
            }
            finalResult = result == 0 ? "Int Overflow" : String.valueOf(result);
        }
        System.out.println(finalResult);
    }
}

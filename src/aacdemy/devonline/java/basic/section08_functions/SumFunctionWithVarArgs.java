package aacdemy.devonline.java.basic.section08_functions;

public class SumFunctionWithVarArgs {
    public static void main(String[] args) {
        System.out.println(sumOf());
        System.out.println(sumOf(1, 2, 3, 4, 5, 6));
        System.out.println(sumOf(3, 4, 5, 6, 7, 8, 9));
    }

    private static int sumOf(int... args) {
        var sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}

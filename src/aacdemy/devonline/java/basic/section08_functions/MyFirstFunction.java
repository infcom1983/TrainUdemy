package aacdemy.devonline.java.basic.section08_functions;

public class MyFirstFunction {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        int result = multOf(a, b);
        System.out.println(result);
    }

    private static int multOf(int a, int b) {
        return a * b;
    }
}

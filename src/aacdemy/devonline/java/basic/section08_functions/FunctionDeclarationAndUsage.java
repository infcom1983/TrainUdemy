package aacdemy.devonline.java.basic.section08_functions;

public class FunctionDeclarationAndUsage {
    public static void main(String[] args) {
        int res = sumOf(2, 3);

        System.out.println(res);
    }

    private static int sumOf(int a, int b) {
        return a + b;
    }
}

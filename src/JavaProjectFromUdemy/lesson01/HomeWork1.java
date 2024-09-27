package JavaProjectFromUdemy.lesson01;

public class HomeWork1 {
    public static void main(String[] args) {
        sum(2, 3);
        multy(2, 4);
        subt(4, 2);
        div(8, 2);

        convert(100, 1.2);
        percent(3);
        print("Bbbbbbb");
    }

    private static void sum(int a, int b) {
        int result = a + b;
    }

    private static void multy(int a, int b) {
        int result = a * b;
    }

    private static void subt(int b, int a) {
        int result = b - a;
    }

    private static void div(int a, int b) {
        int result = a / b;
    }

    private static void convert(double euro, double kurs) {
        double kursDollara = euro * kurs;
    }

    private static void percent(double a) {
        double result = a + a / 10;
    }

    private static String print(String str) {
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        return str;
    }

}

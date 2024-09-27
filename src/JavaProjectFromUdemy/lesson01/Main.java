package JavaProjectFromUdemy.lesson01;

public class Main {
    public static void main(String[] args) {

        int res = sum(30, 40);
        System.out.println(res);

        System.out.println(convert("text"));

        printTwoTimes("text");
    }

    private static int sum(int number1, int number2) {
        int res = number1 + number2;
        return res;
    }

    private static String convert(String str) {
        String res = str + " end.";
        return res;
    }

    private static void printTwoTimes(String str){
        System.out.println(str);
        System.out.println(str);
    }
}

package JavaProjectFromUdemy.lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(closeToFive(a, b));
/*        int a = Integer.parseInt(reader.readLine());
        System.out.println(checkInterval(a));*/



/*        int num1 = Integer.parseInt(reader.readLine());
        if (num1 > 0) {
            System.out.println(num1 * 2);
        } else if (num1 < 0) {
            System.out.println(num1 + 10);
        }*/




/*        int number = 12;
        System.out.println(compare(number));*/



/*        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        if (num1 > num2 & num1 < num3) {
            System.out.println(num1);
        } else if (num2 > num1 & num2 < num3) {
            System.out.println(num2);
        } else if (num3 > num1 & num3 < num2) {
            System.out.println(num3);
        }*/


        /*int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }*/


        /*int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 > num2) {
            System.out.println(num1);

        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("equals");
        }*/
    }

    private static int closeToFive(int a, int b) {

        if (abs(5 - a) < abs(5 - b)) {
            return a;
        } else {
            return b;
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;

        } else {
            return a;
        }
    }


    private static int checkInterval(int a) {
        if (a >= 20 & a <= 50) {
            System.out.println("Число " + a + " содержится в интервале");
        } else {
            System.out.println("Число " + a + " не содержится в интервале");
        }
        return a;
    }


    private static int compare(int a) {
        if (a < 5) {
            System.out.println("Число меньше 5");
        } else if (a > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }
        return a;
    }
}

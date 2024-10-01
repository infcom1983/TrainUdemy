package JavaProjectFromUdemy.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main(String[] args) throws IOException {

        int i = 1;
        int j = 1;
        while (i < 10) {


            while (j < 10) {
                System.out.print("P");
                j++;
            }
            System.out.println("P");
            i++;
            j = 1;
        }

/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        for (int i = 0; i < a; i++) {
            for (int j = 1; j < b; j++) {
                System.out.print(8);
            }
            System.out.println(8);
        }*/

/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(reader.readLine());

        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }*/

/*        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }*/

/*        int i = 0; // Начальный показатель степени
        while (i < 10) { // условие входа в цикл
            i++;
            System.out.println(i);
        }*/

/*        int j = 10; // Начальный показатель степени
        while (j > 1) { // условие входа в цикл
            j--;
            System.out.println(j);
        }*/
    }
}

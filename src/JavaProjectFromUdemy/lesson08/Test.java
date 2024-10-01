package JavaProjectFromUdemy.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("inner " + j);
            }
            System.out.println("text " + i);
        }


/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        while (!str.equals("exit")) {
            System.out.println(str);
            str = reader.readLine();

        }*/
    }
}

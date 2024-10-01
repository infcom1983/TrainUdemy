package JavaProjectFromUdemy.lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age");
        int age = Integer.parseInt(reader.readLine());

        if (age > 18 || age <= 10) {
            System.out.println("Adult content");
        } else {
            System.out.println("No content");
        }
    }
}

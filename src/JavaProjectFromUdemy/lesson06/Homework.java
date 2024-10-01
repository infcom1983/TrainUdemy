package JavaProjectFromUdemy.lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int salary1 = Integer.parseInt(reader.readLine());
        System.out.println("Я зарабатываю $" + salary1 + " в час");

        String name = reader.readLine();
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " будет получать " + num1 + " через " + num2 + " лет.");
    }
}

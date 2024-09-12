package aacdemy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        var year = new Scanner(System.in).nextInt();
        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        System.out.println(isLeap ? "Год Високосный" : "Год не високосный");
    }
}

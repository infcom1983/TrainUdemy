package aacdemy.devonline.java.basic.section06_array;

public class ArrayErrors {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(array[-1]);
        System.out.println(array[500]);
    }
}

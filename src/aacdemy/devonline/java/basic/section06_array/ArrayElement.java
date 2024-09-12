package aacdemy.devonline.java.basic.section06_array;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));

        System.out.println(array[1]);
        array[2] = 55;
        System.out.println(Arrays.toString(array));
    }
}

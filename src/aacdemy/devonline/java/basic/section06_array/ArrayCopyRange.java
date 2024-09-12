package aacdemy.devonline.java.basic.section06_array;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {

        var startIndex = 2;
        var endIndex = 5;

        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] destination = new int[endIndex - startIndex];
        for (int i = 0; i < destination.length; i++) {
            destination[i] = source[i + startIndex];
        }
        System.out.println(Arrays.toString(destination));
    }
}

package aacdemy.devonline.java.basic.section10;

import java.util.Arrays;

public class BinarySearchJDK {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 30, 50, 100};
        int query = 80;

        int index = Arrays.binarySearch(array, query);

        System.out.println("Index= " + index);
    }
}

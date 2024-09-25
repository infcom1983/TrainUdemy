package aacdemy.devonline.java.basic.section10;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}

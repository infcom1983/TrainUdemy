package aacdemy.devonline.java.basic.section08_functions;

public class WhatIsFunction {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 1};

        int[][] result = calculateStatistics(array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " = " + ((double) result[i][1] * 100 / array.length) + " %");
        }
    }

    private static int[][] calculateStatistics(int[] array) {
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            var element = array[i];

            var exists = ifExists(count, unique, element);
            if (!exists) {
                var number = calculateElementCount(array, i, element);

                count = addToResult(unique, count, element, counts, number);
            }
        }

        return convert(count, unique, counts);
    }

    private static boolean ifExists(int count, int[] unique, int element) {
        var exists = false;
        for (int j = 0; j < count; j++) {
            if (unique[j] == element) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    private static int calculateElementCount(int[] array, int i, int element) {
        var number = 1;
        for (int j = i + 1; j < array.length; j++) {
            if (element == array[j]) {
                number++;
            }
        }
        return number;
    }

    private static int addToResult(int[] unique, int count, int element, int[] counts, int number) {
        unique[count] = element;
        counts[count] = number;
        count++;
        return count;
    }

    private static int[][] convert(int count, int[] unique, int[] counts) {
        int[][] result = new int[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = unique[i];
            result[i][1] = counts[i];
        }
        return result;
    }
}

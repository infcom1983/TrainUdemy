package aacdemy.devonline.java.basic.section08_functions;

public class WhatIsFunction {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 1};
        displayResults(array1, calculateStatistics(array1));
        System.out.println("------------");
        int[] array2 = {1, 2, 3, 4, 4, 4, 4, 5, 5, 5, 7, 1};
        displayResults(array2, calculateStatistics(array2));


    }

    private static void displayResults(int[] array, int[][] result) {
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
            if (!isAlreadyProcessed(unique, count, element)) {
                int number = calculateElementCount(array, i, element);
                count = addToResult(unique, counts, count, element, number);
            }
        }

        return convert(count, unique, counts);
    }

    private static boolean isAlreadyProcessed(int[] array, int count, int element) {
        var exists = false;
        for (int j = 0; j < count; j++) {
            if (array[j] == element) {
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

    private static int addToResult(int[] unique, int[] counts, int count, int element, int number) {
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

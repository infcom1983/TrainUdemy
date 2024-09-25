package aacdemy.devonline.java.basic.section11;

import java.util.Arrays;

public class PrintArrayElementsMoreThanAvgVersion3 {
    public static void main(String[] args) {
        int[] array = {1, 4, -5, -2, 0, 12};

        int[] result = subArrayWithMoreThanAvgElements(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] subArrayWithMoreThanAvgElements(int[] array) {
        double sum = getSum(array);
        int avg = getAvg(array, sum);
        return extractElementsMoreThanAvg(array, avg);
    }

    private static int[] extractElementsMoreThanAvg(int[] array, int avg) {
        int[] temp = new int[array.length];
        int index = 0;
        for (int value : array) {
            if (value > avg) {
                temp[index++] = value;
            }
        }
        return trim(temp, index);
    }

    private static int[] trim(int[] temp, int index) {
        int[] result = new int[index];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    private static int getAvg(int[] array, double sum) {
        double avg = sum / array.length;
        int avgInt = (int) avg;
        if (avg - avgInt >= 0.5) {
            avgInt++;
        }
        return avgInt;
    }

    private static double getSum(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}

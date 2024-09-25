package aacdemy.devonline.java.basic.section11;

import java.util.Arrays;

public class PrintArrayElementsMoreThanAvgVersion2 {
    public static void main(String[] args) {
        int[] array = {1, 4, -5, -2, 0, 12};

        int[] result = subArrayWithMoreThanAvgElements(array);

        System.out.println(Arrays.toString(result));

    }

    private static int[] subArrayWithMoreThanAvgElements(int[] array) {
        int avg = calculateAvg(array);
        return extractElementsMoreThanAvg(array, avg);
    }

    private static int calculateAvg(int[] array) {
        double sum = getSum(array);
        double result = sum / array.length;
        return (int)Math.round(result);
    }

    private static double getSum(int[] array) {
        double sum = 0.;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }


    private static int[] extractElementsMoreThanAvg(int[] array, int avg) {
        int[] result = new int[array.length];
        int count = 0;
        for (int value : array) {
            if (value > avg) {
                result[count++] = value;
            }
        }
        return Arrays.copyOf(result, count);
    }
}

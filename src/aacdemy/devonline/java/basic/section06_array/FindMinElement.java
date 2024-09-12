package aacdemy.devonline.java.basic.section06_array;

public class FindMinElement {
    public static void main(String[] args) {

        int[] array = {10, 2, 4, -4, 5};
        var minElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }

        }
        System.out.println(minElement);
    }
}

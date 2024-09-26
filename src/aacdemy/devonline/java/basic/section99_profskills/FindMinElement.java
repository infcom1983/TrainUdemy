package aacdemy.devonline.java.basic.section99_profskills;

public class FindMinElement {
    public static void main(String[] args) {

        int[] array = {1, -2, 8, 0, 5};

        if (array.length == 0) {
            System.out.println("Min element not found, because array is empty");
        } else {
            var min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println(min);
        }
    }
}

package aacdemy.devonline.java.basic.section06_array;

public class ArrayElementCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 5, 6, 2, 2, 2, 2, 3, 4, 2};

        var num = 2;
        var count = 0;

        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                count++;
            }

        }
        System.out.println(count);
    }
}

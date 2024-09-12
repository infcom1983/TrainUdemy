package aacdemy.devonline.java.basic.section06_array;

public class ArrayElementSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        var result = 0;
        for (int i : array) {
            result += i;
        }
        System.out.println(result);

    }
}

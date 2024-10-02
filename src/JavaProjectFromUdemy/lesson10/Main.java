package JavaProjectFromUdemy.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 9 - 1;
        }


/*        arr[0] = 30;
        arr[6] = 56;
        System.out.println(arr.toString());
        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        int[][] array = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }*/

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

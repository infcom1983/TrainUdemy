package aacdemy.devonline.java.basic.section10;

public class BinarySearchInterative {
    public static void main(String[] args) {

        int[] array = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int query = 13;

        int index = binarySearchInterative(array, query);

        System.out.println("Index" + index);
    }

    public static int binarySearchInterative(int[] array, int query) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            //int middleIndex = (startIndex + endIndex) / 2;
            int middleIndex = (startIndex + endIndex) >>> 1;
            int middleValue = array[middleIndex];
            if (query > middleValue) {
                startIndex = middleIndex + 1;
            } else if (query < middleValue) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}

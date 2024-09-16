package aacdemy.devonline.java.basic.section09;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var query = 7;

        System.out.println(findIndex(array, query));
        System.out.println(findIndex(array, query, 0));
        System.out.println(findIndex2(array, query, 0));
    }

    private static int findIndex(int[] array, int query) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndex(int[] array, int query, int i) {
        if (i == array.length) {
            return -1;
        } else if (array[i] == query) {
            return i;
        } else {
            return findIndex(array, query, i + 1);
        }
    }

    private static int findIndex2(int[] array, int query, int i) {
        if (i == array.length) {
            return -1;
        } else {
            var foundIndex = findIndex2(array, query, i + 1);
            if (array[i] == query) {
                return i;
            } else {
                return foundIndex;
            }
        }
    }
}

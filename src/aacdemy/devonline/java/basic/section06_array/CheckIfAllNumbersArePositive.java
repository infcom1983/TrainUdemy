package aacdemy.devonline.java.basic.section06_array;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        var allPositive = true;

        for (int value : array) {
            if (value < 0) {
                allPositive = false;
                break;
            }
        }
        System.out.println(allPositive ? "All Positive" : "Not All Positive");
    }
}

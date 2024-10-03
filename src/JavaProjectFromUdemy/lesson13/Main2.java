package JavaProjectFromUdemy.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Object[] arr = new Object[3];
        arr[0] = 1;
        arr[1] = "str";
        System.out.println(Arrays.toString(arr));

        List list = new ArrayList();
        list.add(1);
        list.add("str");
        System.out.println(list);
    }
}

package JavaProjectFromUdemy.lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        String[] arrStr = new String[7];
        arrStr[0] = "str";

        List<String> list = new ArrayList<>();
        list.add("str");
        list.add("str");
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        System.out.println("List: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "str");
        map.put(2, "str");
        map.put(3, "str2");
        map.put(3, "str3");
        System.out.println("Map: " + map);
    }
}

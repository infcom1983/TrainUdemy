package aacdemy.devonline.java.basic.section2_structure;

public class TypeCast {
    public static void main(String[] args) {

        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);

        System.out.println(ds);

        int si = Integer.parseInt("12");
        double ad = Double.parseDouble("1.2");
        boolean sb = Boolean.parseBoolean("true");
        char ch1 = "a".charAt(0);
        char ch2 = "abc".charAt(1);
        System.out.println(ch2);

        char ch = 2;
        int i = 4;
        double d = 8;
    }
}

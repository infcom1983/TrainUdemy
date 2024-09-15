package aacdemy.devonline.java.basic.section08_functions;

public class BlockExample {
    public static void main(String[] args) {
        int a = 0;
        {
            int b = 0;
            System.out.println(b);
            {
                int c = 0;
                System.out.println(c);
            }
        }
        System.out.println(a);

    }
}

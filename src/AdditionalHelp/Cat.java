package AdditionalHelp;

public class Cat {
    String name;
    int age;

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void jump() {
        System.out.println("Jump-jump");
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Barsik";


        Cat vasia = new Cat();
        vasia.age = 5;
        vasia.name = "Vasia";

        barsik.sayMeow();
        vasia.jump();

        System.out.println("We've created a cat, his name is " + barsik.name + " he's " + barsik.age + " years old.");
        System.out.println("We've created a cat, his name is " + vasia.name + " he's " + vasia.age + " years old.");


    }
}

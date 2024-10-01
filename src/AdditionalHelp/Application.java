package AdditionalHelp;

public class Application {
    public static void main(String[] args) {
        Human human = new Human("Alex", "22");
        Human human2 = new Human();

        System.out.println(human.getName() + " " + human.getAge());
        System.out.println(human2.getName() + " " + human2.getAge());
    }
}

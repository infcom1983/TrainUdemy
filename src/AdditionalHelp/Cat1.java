package AdditionalHelp;

public class Cat1 {
    String name;
    int age;

    static int count = 0;

    public Cat1() {
        count++;
        this.name = "Street cat " + count;
    }

    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Cat1 barsik = new Cat1("Barsik", 5);
        Cat1 streetCat = new Cat1();
        Cat1 streetCat2 = new Cat1();

        System.out.println(streetCat.name);
        System.out.println(streetCat2.name);

    }
}

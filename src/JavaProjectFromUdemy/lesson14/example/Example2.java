package JavaProjectFromUdemy.lesson14.example;

public class Example2<T> {

    private T instance;

    private Example2(){

    }

    public static <T> void simpleInit(T instantiator) {
        T obj;
    }

    public static <T> Example2<T> init(T instantiator) {
        return new Example2<T>();
    }

    public void set(T obj) {
        instance = obj;
    }

    public T getInstance() {
        return instance;
    }
}

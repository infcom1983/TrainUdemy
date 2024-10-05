package JavaProjectFromUdemy.lesson14.example;

public class Example1<T> {
    private T instance;

    public T get() {
        return instance;
    }

    public void set(T obj) {
        instance = obj;
    }
}

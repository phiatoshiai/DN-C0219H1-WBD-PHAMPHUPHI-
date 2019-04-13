package testDefault;

public interface Test {
    default void say(){
        System.out.println ("Hello world");
    }
    void run();
}

interface ABC {
    default void say(){
        System.out.println ("Hello");
    }
    void run1();
}

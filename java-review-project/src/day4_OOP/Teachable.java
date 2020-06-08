package day4_OOP;

public interface Teachable {

    static final int size = 20;

    public abstract void doHomework();
    // can be written just;
    // void doHomework();

    public static void study() {
        // implementation
    }

    public default void learn() {
        // implementation
    }

    void teachMath();

    public static void print() {
        System.out.println(5);

    }

    public default void print2() {
        System.out.println(10);
    }

}

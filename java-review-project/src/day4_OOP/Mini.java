package day4_OOP;

public class Mini extends Car {

    static void m1() {
        System.out.println("c");
    }

    static void m2() {
        System.out.println("d");
    }

    public static void main(String[] args) {

        Car c = new Mini();
        c.m1();
        c.m2();
    }
}

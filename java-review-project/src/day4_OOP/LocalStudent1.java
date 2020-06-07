package day4_OOP;

public class LocalStudent1 extends Student {

    @Override
    public void attendClass() {

        System.out.println("Attending in person");
    }

    @Override
    public void study() {
        System.out.println("Studying");
    }
}
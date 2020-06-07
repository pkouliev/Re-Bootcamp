package day4_OOP;

public class CollegeStudent extends LocalStudent2 {

    @Override
    public void study() {
        System.out.println("College student studying");
    }

    @Override
    public void attendClass() {
        System.out.println("College student attending");
    }
}

package day2_ClassesAndMethods;

public class Animal {

    // instance variables
    String species;
    int size;
    double height;

    public Animal(String species) {
        this.species = species;
    }

    public Animal(String species, int size) {
        this(species);
        this.size = size;
    }

    public Animal(String species, int size, double height) {
        this(species, size);
        this.height = height;
    }
}

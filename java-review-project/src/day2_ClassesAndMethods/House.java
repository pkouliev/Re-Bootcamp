package day2_ClassesAndMethods;

import static java.lang.Math.*; // imports all static members of the Math class

public class House {    // Class name

    String address;

    public House() {
        this.address = "No address yet";       // constructor with no parameters
    }

    public House(String address) {             // overloaded constructor that accepts
        this.address = address;                // an address and stores to instance
    }

    static int numberOfHouses;   // static int variable

    static int getHouse() {     // static return type method
        return max(10, 20);      // uses static max method from Math class
    }

    static {                            // static block ran and
        numberOfHouses = getHouse();    // getHouse() method is called which stores
    }                                   // a number into the static variable numberOfHouses

    public static void main(String[] args) {
        // The value of numberOfHouses is printed after the static block and getHouse() method finished executing
        System.out.println(House.numberOfHouses);

        House houseOne = new House();   // the House class constructor is called or used to invoke constructor
        // reference name of object    // and an object of the class is created
    }


}

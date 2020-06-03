package day2_ClassesAndMethods;

public class Person {

    String name; // Instance variable of String called name
    int age;     // Instance variable of int called age

    void setAge(int age) {  // the setAge method will accept an int value and
        this.age = age;     // store that value to the instance valuable
    }

    public void printAge() {        // This is a void method named printAge.
        System.out.println(age);    // It will print out the object's age instance value.
    }

    public int getAge() {           // This is a return type method named getAge
        return age;                 // It will return the instance age value of the object acted on as int
    }

    // The return keyword is how this metod give a value

    public static void main(String[] args) {

        Person joe = new Person();  // Created a Person object called joe
        joe.name = "Joe";           // assigned "Joe" to the name instance variable
        joe.age = 20;               // assigned 20 to the age instance variable

        System.out.println(joe.name);   // prints the value of name from object joe
        System.out.println(joe.age);    // prints the value of age from object joe

        // use keywords during interview

        Person james = new Person();    // Object of Person class is created with james reference
        james.age = 20;
        james.name = "james";

        james.printAge();               // The void method is invoked and the age of
        // the object (20) will be printed to the console

        int ageVal = james.getAge();    // The return method is invoked and the age instance
        System.out.println(ageVal);     // variable value will be returned so it must be caught
        // in order to be used. Then the variable ageVal will
        // print the value that was returned from the method
    }
}

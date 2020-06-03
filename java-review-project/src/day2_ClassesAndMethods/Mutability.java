package day2_ClassesAndMethods;

public class Mutability {

    public static void main(String[] args) {
        String s = "java";
        StringBuilder ss = new StringBuilder("java");
        System.out.println(s.hashCode());

        System.out.println(s + " is fun");
        System.out.println(s); // original object is not changed, immutable

        s = s + " is fun"; // reassigning, reference from old value is lost
        System.out.println(s.hashCode());
        System.out.println(ss.hashCode());
        System.out.println(s);

        ss.append(" is fun"); // a new version of string buffer
        System.out.println(ss.toString());
        System.out.println(ss.hashCode());

        // mutability is about changing original object
    }
}

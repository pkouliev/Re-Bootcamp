package day2_ClassesAndMethods;

/**
 * Task - 1
 * Create a method that will accept a number and print all the prime number from 2 to that given number
 */
public class PrimeNumber {

    public static void main(String[] args) {
        printAllTo(10);
    }

    public static void printAllTo(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

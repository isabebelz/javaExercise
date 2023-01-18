package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPrimeNumbers {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you'll type? ");
        int numbers = sc.nextInt();

        int[] primeNumbers = new int[numbers];

        for(int i = 0; i < primeNumbers.length; i++) {
            System.out.print("Enter a number: ");
            primeNumbers[i] = sc.nextInt();
            if(isPrime(primeNumbers[i])) {
            }
        }

        System.out.println("Prime numbers: ");

        int primeQuantity = 0;
        for(int i = 0; i < primeNumbers.length; i++) {
            if(isPrime(primeNumbers[i])) {
                System.out.print(primeNumbers[i] + " ");
                primeQuantity += 1;
            }
        }

        System.out.println();
        System.out.println("Number of primes: " + primeQuantity);

        sc.close();
    }
    private static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}

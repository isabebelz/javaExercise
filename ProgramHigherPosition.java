package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHigherPosition {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you'll type? ");
        int numbers = sc.nextInt();

        double[] higherPosition = new double[numbers];

        for(int i = 0; i < higherPosition.length; i++) {
            System.out.print("Enter a number: ");
            higherPosition[i] = sc.nextDouble();
        }

        double higherNumber = 0.0;
        int higher = 0;
        for(int i = 0; i < higherPosition.length; i++) {
            for(int j = 0; j < higherPosition.length; j++) {
                if(higherPosition[i] > higherPosition[j]) {
                    higherNumber = higherPosition[i];
                    higher = i;
                }
            }
        }

        System.out.println("Higher value: " + higherNumber);
        System.out.println("Position of higher value: " + higher);



        sc.close();
    }
}

package application;

import entities.PersonalData;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPersonalData {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be type?");
        int quantity = sc.nextInt();

        PersonalData[] data = new PersonalData[quantity];

        for(int i = 0; i < data.length ; i++) {
            System.out.print("Height of the " + (i + 1) + "st person: ");
            double height = sc.nextDouble();
            System.out.print("Gender of the " + (i + 1) + "st person (M/F): ");
            char gender = sc.next().charAt(0);
            data[i] = new PersonalData(gender, height);
        }

        double lower = data[0].getHeight();
        for(int i = 0; i < data.length ; i++) {
            if(isLowerHeight(data[i].getHeight(), lower)) {
                lower = data[i].getHeight();
            }
        }

        System.out.printf("Lower height = %.2f%n", lower);
        
        
        //Look for the package "entities" for a class named "PersonalData"

        double biggest = data[0].getHeight();
        for(int i = 0; i < data.length ; i++) {
            if(isHigherHeight(data[i].getHeight(), biggest)) {
                biggest = data[i].getHeight();
            }
        }

        System.out.printf("Higher height = %.2f%n", biggest);

        double sum = 0.0;
        int quantityF = 0;
        int quantityM = 0;
        for(int i = 0; i < data.length ; i++) {
            if(data[i].getGender() == 'F') {
                sum += data[i].getHeight();
                quantityF += 1;
            }
            else {
                quantityM += 1;
            }
        }

        double average = sum/quantityF;


        System.out.printf("Average heights of woman = %.2f%n", average);

        System.out.print("Number of men = " + quantityM);



        sc.close();
    }

    private static boolean isHigherHeight(double height, double biggest) {
        if(height > biggest) {
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean isLowerHeight(double height, double lower) {
        if(height < lower) {
            return true;
        }
        else {
            return false;
        }
    }
}

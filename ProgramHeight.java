package application;

import entities.Height;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHeight {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed? ");
        int numberPeople = sc.nextInt();
        Height[] heightData = new Height[numberPeople];

        for(int i = 0; i < heightData.length; i++) {
            System.out.println((i + 1) + "st person data: ");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            heightData[i] = new Height(name, age, height);
        }

        double sumHeight = 0.0;
        for(int i = 0; i < heightData.length; i++) {
            sumHeight += heightData[i].getHeight();
        }

        double averageHeight = sumHeight/numberPeople;

        int under16Years = 0;
        for(int i = 0; i < heightData.length; i++) {
            if(heightData[i].getAge() < 16) {
                int quantity = 0;
                quantity += 1;
                under16Years = quantity * 100 / numberPeople;
            }
        }

        System.out.printf("AVERAGE HEIGHT: %.2f%n", averageHeight);
        System.out.println("People under 16 years of age: " + under16Years + "%");

        for(int i = 0; i < heightData.length; i++) {
            if(heightData[i].getAge() < 16) {
                System.out.println(heightData[i].getName());
            }
        }

        sc.close();
    }
}

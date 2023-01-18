package application;

import entities.Elder;

import java.util.Locale;
import java.util.Scanner;

public class ProgramElder {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people you'll type? ");
        int number = sc.nextInt();

        Elder[] elder = new Elder[number];

        for(int i = 0; i < number; i++) {
            System.out.println("Data of the " + (i + 1) + "st person:");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            elder[i] = new Elder(name, age);
        }

        String old = null;
        for(int i = 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                if(elder[i].getAge() > elder[j].getAge()) {
                    old = elder[i].getName();
                }
            }
        }

        System.out.println("Older person: " + old);



        sc.close();
    }
}

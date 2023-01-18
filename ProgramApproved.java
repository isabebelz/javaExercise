package application;

import entities.Approved;

import java.util.Locale;
import java.util.Scanner;

public class ProgramApproved {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be type? ");
        int quantityStudents = sc.nextInt();

        Approved[] students = new Approved[quantityStudents];

        for(int i = 0; i < students.length; i++) {
            System.out.println("Enter name, first and second grade of the " + (i + 1) + "st student:");
            sc.nextLine();
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            students[i] = new Approved(name, grade1, grade2);
        }

        System.out.println("Approved students:");

        for(int i = 0; i < students.length; i++) {
            if(isApproved(students[i].getGrade1(), students[i].getGrade2())) {
                System.out.println(students[i].getName());
            }
        }

        sc.close();
    }

    private static boolean isApproved(double grade1, double grade2) {
        double average = (grade1 + grade2) / 2;
        if(average >= 6) {
            return true;
        }
        else {
            return false;
        }
    }
}

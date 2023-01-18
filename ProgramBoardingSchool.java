package application;

import entities.BoardingSchool;

import java.util.Scanner;

public class ProgramBoardingSchool {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BoardingSchool[] rooms = new BoardingSchool[10];

        System.out.print("How many rooms will be rented? ");
        int rented = sc.nextInt();


        for(int i = 0; i < rented; i++) {
            System.out.println("Rent #" + (i + 1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new BoardingSchool(name, email, room);
        }

        System.out.println("Busy rooms:");

        for(int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null) {
                System.out.println(rooms[i]);
            }
        }

        sc.close();
    }
}

package com.mycompany.facebook;

import java.util.Scanner;

public class Facebook {

    private static Scanner scanner = new Scanner(System.in);
    private static Auth auth = new Auth();
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Facebook CLI");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    login();
                    break;
                case "2":
                    register();
                    break;
                case "3":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        auth.login(email, password);
    }

    private static void register() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter date of birth: ");
        String dateOfBirth = scanner.nextLine();

        
        auth.register(name, email, password, gender, dateOfBirth);
    }

    private static void mainMenu() {
        System.out.println("Welcome to the main page!");
        System.out.println("1. Logout");
        System.out.print("Choose an option: ");

        String choice = scanner.nextLine();

        if ("1".equals(choice)) {
            System.out.println("Logging out...");
        } else {
            System.out.println("Invalid choice. Returning to main menu.");
        }
    }
}

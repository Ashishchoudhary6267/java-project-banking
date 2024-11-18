package BankManagmentSystem;

import java.util.Scanner;

public class Menu {
    public Menu(Scanner scanner, Account acc) {
        int choice = 0;

        do {
            System.out.println("\nWelcome, " + acc.getFirstName() + " " + acc.getAccid());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new Deposit(scanner, acc); // Assuming there's a Deposit class
                    break;

                case 2:
                    new Withdraw(scanner, acc); // Assuming there's a Withdraw class
                    break;

                case 3:
                    System.out.println("Your balance is: " + acc.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using our services. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
    } 

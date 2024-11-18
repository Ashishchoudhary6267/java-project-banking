package BankManagmentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount 
{
    public CreateAccount(Scanner scanner, int lastaccid, ArrayList<Account> accounts) 
    {
        System.out.println("Enter your first name:");
        String firstName = scanner.next();

        System.out.println("Enter your last name:");
        String lastName = scanner.next();

        System.out.println("Enter balance:");
        double balance = scanner.nextDouble();

        System.out.println("Enter passcode (digits only):");
        int passcode = scanner.nextInt();

        System.out.println("Confirm passcode:");
        int confirmPasscode = scanner.nextInt();

        if (confirmPasscode != passcode) 
        {
            System.out.println("Entered passcode does not match. Try again.\n");
            return;
        }

        long id = 41146752 + lastaccid;
        lastaccid = lastaccid + 1;

        Account acc = new Account(firstName, lastName, id, balance, passcode);
        accounts.add(acc);

        System.out.println("Your account Number is: " + id);
        new Menu(scanner, acc);
    }
}

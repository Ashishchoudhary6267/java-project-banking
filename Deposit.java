package BankManagmentSystem;

import java.util.Scanner;

public class Deposit 
{
    public Deposit(Scanner scanner, Account acc)
        {
            System.out.println("Enter the amount you'd like to deposit, and we'll take care of the rest:");
            double amount=scanner.nextDouble();
            acc.setBalance(acc.getBalance()+amount);
            System.out.println("Deposit successful! We're glad to be part of your financial journey!");
        }
}

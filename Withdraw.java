package BankManagmentSystem;

import java.util.Scanner;

public class Withdraw 
{
    public Withdraw(Scanner scanner, Account acc) 
    {
        System.out.println("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();
        if (amount <= 0) 
        {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }
        if (amount > acc.getBalance()) 
        {
            System.out.println("Insufficient balance! Your current balance is: " + acc.getBalance());
            return;
        }
        acc.setBalance(acc.getBalance() - amount);
        System.out.println("Withdrawal successful! Your new balance is: " + acc.getBalance());
    }
} 

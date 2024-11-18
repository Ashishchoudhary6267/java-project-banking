package BankManagmentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    static Scanner scanner;
    static int Lastaccid =0;
    private static ArrayList<Account> accounts;
    public static void main(String[] args)
    {
        accounts =new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
         
        System.out.println("We Welcome you to the our Bank");
        System.out.println("~AGAV~");
          System.out.println("1.Create new account");  
          System.out.println("2.Login");
          System.err.println("3.Invest in our Bank");
          int i=scanner.nextInt();
          switch (i) 
        {
            case 1: 
            new CreateAccount(scanner, Lastaccid, accounts);
            break;
            case 2: 
             new Login(scanner, accounts); 
            break;
            case 3: 
             new Invest();
        } 
    }
}

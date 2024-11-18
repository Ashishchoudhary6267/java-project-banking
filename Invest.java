package BankManagmentSystem;

import java.util.Scanner;

public class Invest 
{

    public Invest()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Client Investment System!");
        System.out.print("Enter the amount you want to invest in bank stock: ");
        double investmentAmount = scanner.nextDouble();

        System.out.println("Enter the Initial valuation of the Bank: ");
        double initialValuation = scanner.nextDouble();

        System.out.println("Enter the Final Valuation of the Bank: ");
        double finalValuation = scanner.nextDouble();

        System.out.print("Enter the number of years you want to invest: ");
        int years = scanner.nextInt();
        double annualGrowthRate = calculateAnnualGrowthRate(initialValuation, finalValuation, years);
        double finalAmount = investmentAmount * Math.pow((1 + annualGrowthRate), years);
        System.out.printf("After %d years, your investment will grow to: %.2f%n", years, finalAmount);
        System.out.printf("Total profit earned from stock investment: %.2f%n", (finalAmount - investmentAmount));
        System.out.println("\nAdvice:");
        if (annualGrowthRate * 100 > 10) 
        {
            System.out.println("The stock has high growth potential. Consider holding your investment!");
        } else if (annualGrowthRate * 100 > 5) 
            {
                 System.out.println("The stock has moderate growth. Analyze market trends before Buying/selling.");
            } 
            else 
                {
                    System.out.println("The growth rate is low. You need to check your portfolio.");
                }

        scanner.close();
    }
        private double calculateAnnualGrowthRate(double initialValue, double finalValue, int years)
        {
            return Math.pow((finalValue / initialValue), 1.0 / years) - 1;
        }
}

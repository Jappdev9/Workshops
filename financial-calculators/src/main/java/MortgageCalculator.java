import java.util.Scanner;



public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Welcome to the Mortgage Calculator!");

        System.out.print("Enter the principal amount: ");

        double principal = scanner.nextDouble();



        System.out.print("Enter the annual interest rate (in percentage): ");

        double annualInterestRate = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 100 / 12;



        System.out.print("Enter the loan length (in years): ");

        int loanLengthYears = scanner.nextInt();

        int loanLengthMonths = loanLengthYears * 12;



        double monthlyPayment = calculateMonthlyPayment(principal, monthlyInterestRate, loanLengthMonths);

        double totalInterest = calculateTotalInterest(monthlyPayment, loanLengthMonths, principal);



        System.out.printf("The monthly payment is: $%.2f%n", monthlyPayment);

        System.out.printf("Total interest paid over the life of the loan: $%.2f%n", totalInterest);

    }



    public static double calculateMonthlyPayment(double principal, double monthlyInterestRate, int loanLengthMonths) {

        return principal * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -loanLengthMonths));

    }



    public static double calculateTotalInterest(double monthlyPayment, int loanLengthMonths, double principal) {

        return (monthlyPayment * loanLengthMonths) - principal;

    }

}

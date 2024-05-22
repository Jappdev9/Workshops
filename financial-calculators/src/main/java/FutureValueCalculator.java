import java.util.Scanner;



public class FutureValueCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Welcome to the Future Value Calculator!");

        System.out.print("Enter the initial deposit amount: ");

        double deposit = scanner.nextDouble();



        System.out.print("Enter the annual interest rate (in percentage): ");

        double annualInterestRate = scanner.nextDouble();

        double dailyInterestRate = annualInterestRate / 100 / 365;



        System.out.print("Enter the number of years: ");

        int years = scanner.nextInt();

        int days = years * 365;



        double futureValue = calculateFutureValue(deposit, dailyInterestRate, days);

        double totalInterest = futureValue - deposit;



        System.out.printf("The future value is: $%.2f%n", futureValue);

        System.out.printf("Total interest earned: $%.2f%n", totalInterest);

    }



    public static double calculateFutureValue(double deposit, double dailyInterestRate, int days) {

        return deposit * Math.pow(1 + dailyInterestRate, days);

    }

}

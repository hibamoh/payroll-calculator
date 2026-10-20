package com.pluralsight;
import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // get name
        String name = getName(myScanner);

        // get the hours worked
        int hoursWorked = getHoursWorked(myScanner);

        // get pay rate
        double payRate = getHourlyRate(myScanner);

        // get gross pay
        double grossPay = calculateGrossPay(hoursWorked, payRate);

        double overTimePay = calculateOvertime(hoursWorked, payRate);

        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.printf("Hourly rate: $%.2f%n", payRate);
        System.out.printf("Overtime pay: $%.2f%n", overTimePay);
        System.out.printf("Gross pay: $%.2f%n", grossPay);

    }

    public static String getName(Scanner inputScanner) {
        System.out.println("please enter your name");
        String name = inputScanner.nextLine();
        return name;
    }

    public static int getHoursWorked(Scanner inputScanner) {
        System.out.println("how many hours did you work?");
        String userInput = inputScanner.nextLine();

        int hoursWorked = Integer.parseInt(userInput);
        return hoursWorked;
    }

    public static double getHourlyRate(Scanner theScanner) {
        System.out.println("what is your hourly rate?: ");
        String userPayRate = theScanner.nextLine();
        double payRate = Double.parseDouble(userPayRate);
        return payRate;
    }

    public static double calculateGrossPay(int hoursWorked, double payRate) {
        double grossPay = payRate * hoursWorked;
        return grossPay;
    }

    public static double calculateOvertime(int hoursworked, double payRate) {
        double otHours = 0;
        if (hoursworked > 40) {
            otHours = hoursworked - 40;
            double otPayRate = (otHours * 1.5);
            double otPay = (otHours * otPayRate);
            return otPay;
        }
        return 0;
    }
    }


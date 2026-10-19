package com.pluralsight;
import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String name = getName(myScanner);

        float hoursWorked = myScanner.nextFloat();

        myScanner.nextLine();

        System.out.println("what is your hourly rate?: ");
        float hourlyRate = myScanner.nextFloat();

        myScanner.nextLine();

        if (hoursWorked > 40) {
            System.out.println("your gross pay is: " + ((hourlyRate * 1.5) * hoursWorked));
        } else System.out.println("your gross pay is: " + (hourlyRate * hoursWorked));
    }

        public static String getName(Scanner myScanner){
            System.out.println("please enter your name");
             return myScanner.nextLine();
        }
        public static float getHoursWorked(Scanner myScanner){
            System.out.println("how many hours did you work?");
            return myScanner.nextFloat();
        }


    }



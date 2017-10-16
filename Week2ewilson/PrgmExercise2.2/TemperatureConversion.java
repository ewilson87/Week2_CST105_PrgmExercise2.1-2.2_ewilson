
/**
 * Program: Temperature Conversion File: TemperatureConversion.java Summary:
 * Prompts user for a temperature in Fahrenheit Author: Evan W Wilson Date:
 * October 14, 2017
 *
 */
import java.util.Scanner;
//import scanner class from java.util package

public class TemperatureConversion {
    //Begin public class

    public static void main(String[] args) {
        // Begin main method
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will convert a Farhenheit temperature "
                + "to Celsius, and then convert a Celsius temperature to "
                + "Farhenheit.");
        String again;
        again = "YES";
        while ((again.toUpperCase().equals("YES"))) {
            System.out.print("Please enter a temperature in Farhenheit: ");

            //declare variable numbers, and prompt user for farhnheit
            double farhenheit, celsius;
            farhenheit = sc.nextDouble();

            //convert farhenheit to celsius
            celsius = (farhenheit - 32) * (5.0 / 9);
            celsius = Math.round(celsius * 100.0) / 100.0;
            System.out.println(farhenheit + ("° Farhenheit is " + celsius)
                    + "° Celsius.");

            //prompt user for celsius and convert to farhenheit
            System.out.print("Please enter a temperature in Celsius: ");
            celsius = sc.nextDouble();
            farhenheit = (celsius * 9.0 / 5) + (32);
            farhenheit = Math.round(farhenheit * 100.0) / 100.0;
            System.out.println(celsius + ("° Celsius is " + farhenheit)
                    + "° Farhenheit.");

            //prompt user to repeat?
            System.out.print("Do you want to repeat the program? Type YES or NO. ");
            again = sc.next();

            //If any input other than YES is entered, thank the user and end program
            if (!"YES".equals(again)) {
                System.out.println("Thank you for using this program. Goodbye.");

            }
        }

    }

}

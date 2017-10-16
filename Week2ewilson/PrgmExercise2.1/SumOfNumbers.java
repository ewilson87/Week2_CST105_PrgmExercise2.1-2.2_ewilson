
/** Program: Sum Of Numbers
* File: SumOfNumbers.java
* Summary: Prompts user for a 5 digit positive integer, then outputs the sum.
* Author: Evan W Wilson
* Date: October 11, 2017 
**/
import java.util.Scanner;
    //import scanner class from java.util package

public class SumOfNumbers {
    //Begin public class
    
    public static void main(String[] args) {
        // Begin main method
        Scanner sc = new Scanner(System.in);
        
        System.out.println("This program will output the sum of a 5 digit "
                + "positive integer.");
        System.out.print("Please enter a 5 digit positive integer now:  ");
        
        //declare variable number, and prompt user for number
        int number;
        number = sc.nextInt();
        
        /**Create a loop, using / and % to to separate the digits
        *uses number / 10 to remove the last digit from the number
        *uses sum = sum + last digit to add the last digit to the sum
        *uses number % 10 to give the last digit
        *ends loop when remainingNumber is no longer greater than 0
        **/
        
        int sum = 0; 
        //declare sum variable, starting at 0
        int remainingNumber = number; 
        //declare remainingNumber variable so number variable can be output later
        while (remainingNumber > 0) {
            int lastDigit = remainingNumber %  10;
            sum = sum + lastDigit;
            remainingNumber = remainingNumber / 10;
        }
        System.out.println("Sum of the digits of " + number + " is " + sum);

    }

}

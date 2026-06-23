package javaBasicPrograms;

// An Armstrong Number is a number that equals the sum of its own digits, each raised to the power of the number of digits.
// It is also called Narcissistic numbers.
// Example: 153, 9474 are Armstrong numbers
// There are no 2-digit Armstrong numbers

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String args[]){

    /*
        // =========== 3 digit numbers only ============
        int n, arg, sum = 0, r;
        Scanner scanner = new Scanner(System.in);

//        n = 153;  // input value which is an Armstrong Number
        System.out.println("Enter number value to check if it is an Armstrong number: ");
        n = scanner.nextInt();
        arg = n;          // arg stores the original number because we will modify "n" in the loop

        // while loop extracts each digit and calculate sum of cubes
        while(n > 0){
            r = n % 10;     // Getting the last digit (remainder when divided by 10)
            sum = sum + (r * r * r);    // adding cube of the digit to running sum
            n = n / 10;             // removing the last digit using integer division by 10
        }



        // checking if arg (the original number) is equal to the calculated sum
        if(arg == sum){
            System.out.println("Given number is armstrong number: " + arg);
        } else {
            System.out.println("Given number is not armstrong number: " + arg);
        }
        */

        // ======== UNIVERSAL ARMSTRONG CHECKER ==========


    }
}

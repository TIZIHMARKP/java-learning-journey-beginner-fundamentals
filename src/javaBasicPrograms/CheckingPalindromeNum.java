package javaBasicPrograms;

import java.util.Scanner;

/**
 * Program to check if a given number is a Palindrome or not.
 * A palindrome number reads the same backward as forward.
 * e.g: 121, 12321, 1001, 1221 are palindrome numbers
 * e.g: 123, 456, 1000 are not palindrome numbers
*/

public class CheckingPalindromeNum {
    public static void main(String[] args){
        // pal = stores a copy of original number
        // r = stores the remainder (last digit) in each iteration
        // rev = stores the reversed number
        int n, pal, r, rev=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check if it is palindrome number: ");
        n = scanner.nextInt();
        pal = n;

        /**
         * ========= REVERSING THE NUMBER ==========
         * while loop extracts the digtis from right to left and builds the reversed number
         * e.g for n = 123
         * Iteration 1: n = 123
         *      r = 123 % 10 = 3
         *      rev = 0 * 10 + 3 = 3    (1st digit in rightmost number)
         *      n = 123 / 10 = 12       (removing the last digit from original)
         *
         * Iteration 2: n = 12
         *      r = 12 % 10 = 2
         *      rev = 3 * 10 + 2 = 32   (shift the existing digit left & add new digit)
         *      n = 12 / 10 = 1         (removing the last digit from original)
         *
         * Iteration 3: n = 1
         *      r = 1 % 10 = 1            (We get the rightmost digit)
         *      rev = 32 * 10 + 1 = 321   (shift the existing digit left & add new digit)
         *      n = 1 / 10 = 0            (removing the last digit from original)
         *
         *  Iteration 4: n = 0 => Loop condition is false => exit loop
         *
         *  Result: Original number 123 => Reversed number 321
         */

        while(n > 0){
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if(rev == pal){
            System.out.println("The given number is palindrome: " + rev);
        } else {
            System.out.println("The given number is not palindrome: " + rev);
        }
    }
}

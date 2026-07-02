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
        int n, pal, r, rev=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check if it is palindrome number: ");
        n = scanner.nextInt();
        pal = n;

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

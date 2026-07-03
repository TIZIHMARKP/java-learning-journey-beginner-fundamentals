package javaBasicPrograms;
import java.util.Scanner;
/**
 * Program to find and display all palindrome numbers from 1 to a given limit.
 *
 * New Concept: This program uses a nested loop structure:
 * - Outer loop: Iterates through each number from 1 to the limit
 * - Inner Loop: Reverses each number to check if it's a palindrome
 *
 * Example output for limit = 50:
 * =========== Palindrome numbers from 1 to 50 ===
 *  1
 *  2
 *  3
 *  4
 *  5
 *  6
 *  7
 *  8
 *  9
 *  11
 *  22
 *  33
 *  44
 */

public class PalindromeUptoN {
    public static void main(String[] args){
        // Variable Declarations:
        // n = temporary variable to hold current number being processed
        // b = stores the last digit (remainder), similar to 'r' in previous code
        // limit = user input (how many numbers to check)
        // rev = stores the reversed number

        int n, b, limit, rev = 0;
        Scanner scanner = new Scanner(System.in);
//        int limit = 50;

        System.out.println("Enter limit to check Palindrome Number: ");
        limit = scanner.nextInt();
        System.out.println("===== Palindrome numbers from 1 to " + limit + " ====");

        for(int i = 1; i <= limit; i++){
            n = i;
            while (n > 0){
                b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;
            }
            if(rev == i){
                System.out.println(i + " ");
            }
            rev = 0;
        }
    }
}

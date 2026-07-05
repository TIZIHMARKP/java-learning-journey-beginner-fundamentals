package javaBasicPrograms;

import java.util.Scanner;
/**
 * Program to find all prime numbers from 1 to a given limit.
 * Also calculates the sum and average of all prime numbers found.
 *
 * A prime number is a number that has exactly 2 factors: 1 and itself.
 * Examples: 2, 3, 5, 7, 11, 13, 17, 19, 23, ...
 * Note: 1 is NOT a prime number (only has 1 factor)
 */

public class PrimeNumberUptoN {

    public static void main(String[] args){
        // Variable declarations:
        // limit - user input: upper limit to check for prime numbers
        // num   - inner loop variable to test divisibility
        // i     - outer loop variable (current number being tested)
        int limit, num = 0, i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit to check for prime numbers: ");
        limit = scanner.nextInt();
        System.out.println("Prime numbers from 1 to " + limit + " are: ");

        /**
         * ====================================================
         * OUTER LOOP: Check each number from 1 to limit
         * ================================================
         *
         * For each number 'i', we check if it's prime by counting its factors
         * A prime number has exactly 2 factors: 1 and itself
         *
         * Example for i = 7:
         *   Check divisibility by: 7, 6, 5, 4, 3, 2, 1
         *   Only 7 and 1 divide 7 → 2 factors → PRIME ✓
         *
         * Example for i = 6:
         *   Check divisibility by: 6, 5, 4, 3, 2, 1
         *   6, 3, 2, 1 divide 6 → 4 factors → NOT PRIME ✗
         */
        for (i = 1; i <= limit; i++){
            int counter = 0;
            for(num = i; num >= 1; num--){
                if(i % num == 0){
                    counter = counter + 1;
                }
            }
            if(counter == 2){
                System.out.print(i + " ");
            }
        }
    }
}

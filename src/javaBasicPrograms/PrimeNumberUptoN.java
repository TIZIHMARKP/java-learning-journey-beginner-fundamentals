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

        int sumOfPrimes = 0;
        int primeCount = 0;
        double average = 0.0;

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
            /**
             * ======================================================
             * COUNTER RESET: CRITICAL FOR EACH NUMBER
             * =============================================
             *
             * 'counter' is declared INSIDE the outer loop
             * This means it's reinitialized to 0 for each number we test
             *
             * If we declared it outside, it would keep counting factors
             * from previous numbers which will give us WRONG RESULTS
             *
             *
             */
            int counter = 0;
            /**
             * ============================================================
             * INNER LOOP: Count factors of the current number
             * ======================================
             *
             * This loop checks if 'num' divides 'i' evenly (i % num == 0)
             *
             * LOGIC: For i = 7
             *   num = 7 → 7 % 7 == 0 → counter++ (counter = 1)
             *   num = 6 → 7 % 6 == 0? NO
             *   num = 5 → 7 % 5 == 0? NO
             *   num = 4 → 7 % 4 == 0? NO
             *   num = 3 → 7 % 3 == 0? NO
             *   num = 2 → 7 % 2 == 0? NO
             *   num = 1 → 7 % 1 == 0 → counter++ (counter = 2)
             *   Loop ends → counter = 2 → PRIME
             *
             *   - We start from 'i' and go down to 1
             *   - Every number is divisible by itself and 1
             *   - If any other number divides it, counter > 2
             *   - Prime numbers have EXACTLY 2 factors
             */
            for(num = i; num >= 1; num--){
                if(i % num == 0){
                    counter = counter + 1;  // Increminting factor counter
                }
            }

            // Checking if Current Number is Prime
            if(counter == 2){
                System.out.print(i + " ");  // Printing the prime number

                sumOfPrimes = sumOfPrimes + i;
                primeCount = primeCount + 1;
            }
        }

        /**
         * ===================================
         * PRINT RESULTS Of NEW ADDITION
         * =====================
         *
         */

         System.out.println(); // New Line

        // Displaying sum of primes
        System.out.println("Sum of prime Numbers: " + sumOfPrimes);

        System.out.println("Total prime numbers found: " + primeCount);

        // Calculating and displaying the average
        if(primeCount > 0){
            average = sumOfPrimes / (double) primeCount;
            System.out.println("Average of prime numbers: " + average);
        } else{
            System.out.println("Average of prime numbers: 0 (No prime numbers found");
        }

        scanner.close();

    }
}

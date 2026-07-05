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
        int limit, num = 0, i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit to check for prime numbers: ");
        limit = scanner.nextInt();
        System.out.println("Prime numbers from 1 to " + limit + " are: ");

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

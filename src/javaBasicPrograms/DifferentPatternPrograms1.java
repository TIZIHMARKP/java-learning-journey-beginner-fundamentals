package javaBasicPrograms;

import java.util.Scanner;

public class DifferentPatternPrograms1 {
    public static void main(String[] args){
        int n, i, j, k, l, m, p, q, r, s;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();
        /**
         * p and q are used as counters that decrease with each row
         * They control the number of spaces in the middle
         * p = n, q = n (both start at n and decrement)
         * p is used in Pattern 1, q is used in patter 2
         */
        p = n;
        q = n;

        /**
         * =================
         * PATTERN 1: Triangle with decreasing stars and increasing Gap
         * ======================
         *
         * For n = 5, output should be:
         * *********  => Row 0: 5 stars + 0 spaces + 4 stars = 9 stars total
         * **** ****  => Row 1: 4 stars + 1 space + 4 stars = 8 stars + 1 space
         * ***   ***  => Row 2: 3 stars + 3 spaces + 3 stars = 6 stars + 3 spaces
         * **     **  => Row 3: 2 stars + 5 spaces + 2 stars = 4 stars + 5 spaces
         * *       *  => Row 4: 1 star + 7 spaces + 1 star = 2 stars + 7 spaces
         *
         * Logic:
         * - Left side: Stars decrease from n to 1
         * - Middle: Spaces increase (odd numbers: 1, 2, 5, 7...)
         * - Right side: Stars decrease from n-1 to 1 (skipping first row)
         *
         */

        for(i = n; i >= 1; i--){  // Outer loop: rows from n down to 1
            /**
             * PART 1: Left side stars
             * prints stars from n down to 1
             * e.g for n=5, i=5: prints 5 stars
             * e.g for n=5, i=4: prints 4 stars
             */
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            /**
             * PART 2: Middle spaces
             *
             * KEY LOGIC: k = p * 2; k < n * 2 - 1
             *
             * This would create the gap in the middle that increases each row
             */
            for(k = p*2; k < n*2-1; k++){
                System.out.print(" ");
            }
            for(l = i; l != 0; l--){
                if(l == n){
                    continue;
                }
                System.out.print("*");
            }
            p--;
            System.out.println();
        }

        /**
         * Patten 2:
         * *       *
         * **     **
         * ***   ***
         * **** ****
         * *********
         */

        System.out.println();
        System.out.println("==== Pattern 2 =====");
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(k = q*2-2; k > 1; k--){
                System.out.print(" ");
            }
            for(m = i; m != 0; m--){
                if(m == n){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
            q--;
        }

        /**
         * Patten 3: Combine Pattern 1 + 2
         * *********
         * **** ****
         * ***   ***
         * **     **
         * *       *
         * *       *
         * **     **
         * ***   ***
         * **** ****
         * *********
         *
         */

        // Resetting p and q to n (Original values)
        p = n;
        q = n;

        System.out.println("==== Pattern 3 (Combined) =====");
        /**
         * PART 1: Pattern 1 (Decreasing triangle with gap)
         * Same logic as Pattern 1
         */
        for(i = n; i >= 1; i--){
            // Left side stars
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            // Middle spaces
            for(k = p * 2; k < n*2-1; k++){
                System.out.print(" ");
            }
            // Right side stars
            for(l = i; l != 0; l--){
                if(l == n){
                    continue;
                }
                System.out.print("*");
            }

            p--;
            System.out.println();
        }

        /**
         * PART 2: Pattern 2 (Increasing triangle with gap)
         * Same logic as Pattern 2
         */
        for(i = 1; i <= n; i++){
            // left side stars
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }

            // Middle spaces
            for(k = q * 2 - 2; k > 1; k--){
                System.out.print(" ");
            }

            // Right side stars
            for(m = i; m != 0; m--){
                if(m == n){
                    continue;
                }
                System.out.print("*");
            }

            System.out.println();
            q--;
        }





    }
}

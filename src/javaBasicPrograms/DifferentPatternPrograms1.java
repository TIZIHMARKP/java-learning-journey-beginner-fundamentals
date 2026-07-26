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
             *
             * Explanation for n = 5:
             * Row 0 (i=5, p=5): k=10; k<9 => false => 0 spaces
             * Row 1 (i=4, p=4): k=8; k<9 => true => prints 1 space
             * Row 2 (i=3, p=3): k=6; k<9 => prints 3 spaces (6, 7, 8)
             * Row 3 (i=2, p=2): k=4; k<9 => prints 5 spaces (4, 5, 6, 7, 8)
             * Row 4 (i=1, p=1): k=2; k<9  => prints 7 spaces (2, 3, 4, 5, 6, 7, 8)
             */
            for(k = p*2; k < n*2-1; k++){
                System.out.print(" ");      // printing spaces
            }
            /**
             * PART 3: Right side stars
             *
             * prints stars from i down to 1, but it skips when l == n
             * THis would create the right side of the pattern
             *
             * e.g for n=5, i=5:
             * l=5,4,3,2,1  l==n? skip 5 => prints 4,3,2,1 (4 stars)
             *
             * e.g for n=5, i=4:
             * l=4,3,2,1 => no skip => prints 4,3,2,1 (4 stars)
             *
             * e.g for n=5, i=1:
             * l=1 => no skip => prints 1 (1 star)
             *
             * The reason why we skip l==n is because
             *  - First row (i=n) has no gap, so we don't duplicate the middle
             *  - This would then create the perfect V-shpe
             *
             *
             *
             */
            for(l = i; l != 0; l--){
                if(l == n){
                    continue;  // Skipping this iteration (not printing star)
                }
                System.out.print("*");
            }
            p--;   // Decreasing p for next row (reducing spaces in next iteration)
            System.out.println();   // new line
        }


        System.out.println("\n========================================");
        System.out.println("PATTERN 2: Increasing Triangle with Gap");
        System.out.println("========================================\n");
        System.out.println("For n = " + n + ":");
        /**
         * ========================================
         * Patten 2: Triangle with Increasing Stars and Decreasing Gap
         * =====================================================
         *
         * This is an inverse of pattern 1
         *
         * for n=5, output should be:
         * *       *   => Row 0: 1 star + 7 spaces + 1 star = 2 stars + 7 spaces
         * **     **   => Row 1: 2 stars + 5 spaces + 2 stars = 4 stars + 5 spaces
         * ***   ***   => Row 2: 3 stars + 3 spaces + 3 stars = 6 stars + 3 spaces
         * **** ****   => Row 3: stars + 1 space  + 4 stars = 8 stars + 1 space
         * *********   => Row 4: stars + 0 spaces + 4 stars = 9 stars total
         *
         * Logic:
         * - Left side: stars are increasing from 1 to n
         * - Middle: Spaces decrease (odd numbers: 7, 5, 3, 1, 0)
         * - Right side: Stars increase from 1 to n-1 (skipping last row)
         */

        System.out.println();
        System.out.println("==== Pattern 2 =====");
        for(i = 1; i <= n; i++){   // Outer loop: rows from 1 to n
            /**
             * Printing stars from 1 to i (increasing)
             * e.g fro n=5, i=1: prints 1 star
             * e.g for n=5, i=5: prints 5 stars
             */
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            /**
             * PART 2: Middle spaces
             *
             * Main logic: k= q * 2 - 2; k>1; k--
             * THis is going to create the decreasing gap in the middle
             *
             * e.g for n = 5:
             *   Row 0 (i=1, q=5): k=8; k>1 => prints 7 spaces (8,7,6,5,4,3,2)
             *   Row 1 (i=2, q=4): k=6; k>1 => prints 5 spaces (6,5,4,3,2)
             *   Row 2 (i=3, q=3): k=4; k>1 => prints 3 spaces (4,3,2)
             *   Row 3 (i=4, q=2): k=2; k>1 => prints 1 space  (2)
             *   Row 4 (i=5, q=1): k=0; k>1 => false → 0 spaces
             */
            for(k = q*2-2; k > 1; k--){
                System.out.print(" ");    // printing space
            }
            /**
             * Part 3: Right side stars
             * printing stars from i down to 1, but skips when m == n
             * this would create the right side of the pattern
             *
             * e.g for n=5, i=1:
             *  m=1 => no skip => prints 1 star
             *
             * e.g for n=5, i=4:
             * m=4,3,2,1 => no skip => prints 4 stars
             *
             * e.g for n=5, i=5
             *  m=5,4,3,2,1 => m==n? skip 5 => prints 4,3,2,1 (4 stars)
             *
             * Reason for skip m==n?
             *  - last row (i=n) has no gap, so we don't duplicate the middle star
             *  - This is then going to create the perfect V-shape
             *
            */
            for(m = i; m != 0; m--){
                if(m == n){
                    continue;  // skipping this iteration without printing star
                }
                System.out.print("*");
            }
            System.out.println(); // new line
            q--;  // decreasing q for next row which reduces spaces in next iteration
        }

        /**
         * ======================================
         * Patten 3: Combination of Pattern 1 and 2
         * ===========================================
         *
         * This pattern first prints Pattern 1 (Decreasing)
         * Then prints Pattern 2 (Increasing)
         *
         * for n = 5, output would be:
         * *********    <= Pattern 1 (Row 0)
         * **** ****    <= Pattern 1 (Row 1)
         * ***   ***    <= Pattern 1 (Row 2)
         * **     **    <= Pattern 1 (Row 3)
         * *       *    <= Pattern 1 (Row 4)
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

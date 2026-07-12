package javaBasicPrograms;

public class PyramidPattern1 {
    public static void main(String[] args){
        int n = 7, i, j;

        /**
         * =====================================================
         * PATTERN 1: LEFT-ALIGNED RIGHT TRIANGLE
         * ===============================================
         *
         * *
         * **
         * ***
         * ****
         * *****
         */
        for(i = 0; i < n; i++){     // Outer Loop: Controls rows (o to n - 1)

            for(j = 0; j <= i; j++){   // Inner Loop: Controls stars in each row
                System.out.print("*");
            }
            System.out.println();     // Moving to next line after each row
        }

        System.out.println();



        /**
         * ====================================================
         * PATTERN 2: EQUILATERAL TRIANGLE (PYRAMID)
         * =============================================
         *
         * For n = 4, the output would be:
         *
         *    *      ← Row 0: 3 spaces, 1 star
         *   ***     ← Row 1: 2 spaces, 3 stars
         *  *****    ← Row 2: 1 space,  5 stars
         * *******   ← Row 3: 0 spaces, 7 stars
         *
         * FORMULAS:
         *   spaces = n - i - 1    (number of leading spaces)
         *   stars = 2 * i + 1      (number of stars in each row)
         *
         * Reason for FORMULAS?
         *   - Row 0: spaces = 4-0-1 = 3, stars = 2*0+1 = 1
         *   - Row 1: spaces = 4-1-1 = 2, stars = 2*1+1 = 3
         *   - Row 2: spaces = 4-2-1 = 1, stars = 2*2+1 = 5
         *   - Row 3: spaces = 4-3-1 = 0, stars = 2*3+1 = 7
         *
         *   So this means stars double by 2, while spaces reduces by 1
         */

        System.out.println("=== Equilateral Triangle (Pyramid) ===");

        for(i = 0; i < n; i++){  // Outer loop for rows
            /**
             * 1st STep: Printing leading spaces
             * These spaces center the triangle
             * As i increases, spaces decrease
             * e.g for n = 4, i = 0:
             * j = 0, 1, 2, => prints 3 spaces
            */
            for(j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            /**
             * 2nd STep: Printing stars
             * The number of stars follows odd number sequence: 1, 3, 5, 7, .....
             * Formula: stars = 2 * i + 1
             * e.g for n = 4, i = 0:
             * j = 0 => prints star
             *
             * for n = 4, i = 1:
             * j = 0, 1, 2 => prints 3 stars
             */
            for( j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }

            System.out.println();   // Moving to next line after each row

        }

        System.out.println();


        /**
         * ======================================================
         * PATTERN 3: RIGHT-ALIGNED RIGHT TRIANGLE
         * =================================================
         *
         *    *
         *   **
         *  ***
         * ****
         */

        System.out.println("======== RIGHT-ALIGNED RIGHT TRIANGLE ====== ");

        for(i = 0; i < n; i++){
            // Printing spaces first right alignment
            for(j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            // Printing stars
            for(j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();  // Printing new line
        }
        System.out.println();

        /**
         * =====================================================
         * PATTERN 4: INVERTED EQUILATERAL TRIANGLE
         * ==============================================
         *
         * *******
         *  *****
         *   ***
         *    *
         */

        System.out.println("========= INVERTED EQUILATERAL TRIANGLE =========== ");

        for(i = n - 1; i >= 0; i--){
            for(j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            for(j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();




    }

}

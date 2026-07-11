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
    }

}

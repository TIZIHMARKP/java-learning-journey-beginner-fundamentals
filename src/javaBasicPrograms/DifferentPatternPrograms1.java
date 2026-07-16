package javaBasicPrograms;

import java.util.Scanner;

public class DifferentPatternPrograms1 {
    public static void main(String[] args){
        int n, i, j, k, l, m, p, q, r, s;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = scanner.nextInt();
        p = n;
        q = n;

        /**
         * Pattern 1:
         * *********
         * **** ****
         * ***   ***
         * **     **
         * *       *
         */

        for(i = n; i >= 1; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
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
         */




    }
}

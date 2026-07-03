package javaBasicPrograms;

import java.util.Scanner;

public class PalindromeUptoN {
    public static void main(String[] args){
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

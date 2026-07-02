package javaBasicPrograms;

import java.util.Scanner;

public class CheckingPalindromeNum {
    public static void main(String[] args){
        int n, pal, r, rev=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check if it is palindrome number: ");
        n = scanner.nextInt();
        pal = n;

        while(n > 0){
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if(rev == pal){
            System.out.println("The given number is palindrome: " + rev);
        } else {
            System.out.println("The given number is not palindrome: " + rev);
        }
    }
}

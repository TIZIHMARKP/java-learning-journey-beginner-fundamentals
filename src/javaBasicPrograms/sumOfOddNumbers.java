package javaBasicPrograms;

// === Sum of odd numbers between 1 -100 ===

import java.util.Scanner;

public class sumOfOddNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the upper bound to get sum of Odd Numbers: ");
        int upper = scanner.nextInt();
        System.out.println("The sum of odd numbers between 1 and " + upper + " are: ");

        for(int i = 1; i <= upper; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }

        System.out.println("Sum: " + sum);
    }

}

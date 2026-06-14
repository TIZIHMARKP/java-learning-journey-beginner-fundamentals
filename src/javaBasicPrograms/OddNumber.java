package javaBasicPrograms;

// Displaying Odd Numbers between 1 - 100

import java.util.Scanner;

public class OddNumber {

    public static  void main(String args[]){
        int i;
        Scanner scanner = new Scanner(System.in);

        // User inputs the upper bound of number to get odd numbers from 1 - upperBount
        System.out.println("Enter the maximum number you want to get odd numbers between: ");
        int upper = scanner.nextInt();
        System.out.println("The Odd Numbers are: ");


        for(i = 1; i <= upper; i++){
            // Checking if number is odd number
            if(i % 2 != 0){
                System.out.println(i + " ");
            }
        }
    }
}

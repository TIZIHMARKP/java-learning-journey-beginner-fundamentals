package javaBasicPrograms;

import java.util.Scanner;

public class sumOfDigitsOfaNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, rem = 0, sum = 0, temp;

        // rem stores the remainder (last digit when divided by 10)
        // temp stores a copy of the original number for display purposes
        // sum accumulates the sum of all digits


        System.out.println("Enter number to get sum of digits in number: ");
        num = scanner.nextInt();
        temp = num;



        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Sum of digtis of " + temp+ " is: "+sum);
    }
}



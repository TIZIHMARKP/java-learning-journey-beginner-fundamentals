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

        // WHILE loop continues until num becomes 0
        // Extracting each digit from the rightmost position one by one
        while(num > 0){
            rem = num % 10;  // get the last digit of the number using modulo. e.g if num = 123, means that 123 % 10 = 3 (last digit)
            sum = sum + rem;  // adding the extracted digit to the running sum
            num = num / 10;   // Removing the last digit from the number by integer division by 10. e.g if num = 123, then 123 / 10 = 12

            // the loop then continues with the reduced number until all the digits of the number are processed
            // e.g 123 -> 12 -> 1 -> 0 (the loop is gonna stop here)
        }

        System.out.println("Sum of digtis of " + temp+ " is: "+sum);
    }
}



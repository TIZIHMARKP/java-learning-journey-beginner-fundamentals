package javaBasicPrograms;

// An Armstrong Number is a number that equals the sum of its own digits, each raised to the power of the number of digits.
// It is also called Narcissistic numbers.
// Example: 153, 9474 are Armstrong numbers
// There are no 2-digit Armstrong numbers

import java.util.Scanner;

//public class armstrongNumber {
//    public static void main(String args[]){
//
//    /*
//        // =========== 3 digit numbers only ============
//        int n, arg, sum = 0, r;
//        Scanner scanner = new Scanner(System.in);
//
////        n = 153;  // input value which is an Armstrong Number
//        System.out.println("Enter number value to check if it is an Armstrong number: ");
//        n = scanner.nextInt();
//        arg = n;          // arg stores the original number because we will modify "n" in the loop
//
//        // while loop extracts each digit and calculate sum of cubes
//        while(n > 0){
//            r = n % 10;     // Getting the last digit (remainder when divided by 10)
//            sum = sum + (r * r * r);    // adding cube of the digit to running sum
//            n = n / 10;             // removing the last digit using integer division by 10
//        }
//
//
//
//        // checking if arg (the original number) is equal to the calculated sum
//        if(arg == sum){
//            System.out.println("Given number is armstrong number: " + arg);
//        } else {
//            System.out.println("Given number is not armstrong number: " + arg);
//        }
//        */
//
//        // ======== UNIVERSAL ARMSTRONG CHECKER ==========
//        int n, arg, sum = 0, r;
//        Scanner scanner = new Scanner(System.in);
//
//    //        n = 153;  // input value which is an Armstrong Number
//        System.out.println("Enter number value to check if it is an Armstrong number: ");
//        n = scanner.nextInt();
//        arg = n;
//
//        // 1st Step: Counting the number of digits in the number
//        int temp = n;  // temporary variable for the digit counting
//        int digitCount = 0;
//
//        while(temp > 0){
//            digitCount++;       // incrementing count for each digit
//            temp = temp / 10;   // removing last digit
//        }
//        // e.g n = 9474 => digitCount = 4
//
//        // 2nd Step: Calculating the sum of each digit raised to the power of digitCount
//        while(n > 0){
//            r = n % 10;       // extracting the rightmost digit
//
//            // calculating r^digitCount
//            // Math.pow(base, exponent) returns a double, so we store it or cast it to int
//            sum = sum + (int)Math.pow(r, digitCount);
//
//            n = n / 10;  // removing the rightmost digit
//        }
//
//        if(arg == sum){
//            System.out.println("Given number is armstrong number: " + arg);
//        } else {
//            System.out.println("Given number is not armstrong number: " + arg);
//        }
//
//    }
//}

//  ============== USING METHOD APPROACH ===========
public  class armstrongNumber {

    // method to check if number is Armstrong
    public static boolean isArmstrong(int number){
        int originalNumber = number;
        int sum = 0;
        int digitCount = getDigitCount(number);

        while(number > 0){
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        return originalNumber == sum;
    }

    public static int getDigitCount(int number){
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }

        return count;
    }

    public static void main(String args[]){
        int[] testNumbers = {153, 2875, 9474, 123, 370, 1634};

        System.out.println("Armstrong Number Checker");
        System.out.println("========================");

        for(int num: testNumbers){
            if(isArmstrong(num)){
                System.out.println(num + " is an Armstrong Number");
            } else {
                System.out.println(num + " is NOT an Armstrong Number");
            }
        }
    }
}

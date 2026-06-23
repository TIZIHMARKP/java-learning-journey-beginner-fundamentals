package javaBasicPrograms;

// An Armstrong Number is a number that equals the sum of its own digits, each raised to the power of the number of digits.
// It is also called Narcissistic numbers.
// Example: 153, 9474 are Armstrong numbers
// There are no 2-digit Armstrong numbers

public class armstrongNumber {
    public static void main(String args[]){
        int n, arg, sum = 0, r;

        n = 153;  // input value
        arg = n;

        for(int i = 1; i < n; i++){
            while(n > 0){
                r = n % 10;
                sum = sum + (r * r * r);
                n = n / 10;
            }
        }

        if(arg == sum){
            System.out.println("Given number is armstrong number: " + arg);
        } else {
            System.out.println("Given number is not armstrong number: " + arg);
        }
    }
}

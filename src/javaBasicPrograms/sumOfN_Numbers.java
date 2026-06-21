package javaBasicPrograms;

import java.util.Scanner;

public class sumOfN_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the range of numbers to find the sum: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of "+n+ " Numbers are: " + sum);


    }
}

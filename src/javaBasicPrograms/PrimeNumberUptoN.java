package javaBasicPrograms;

import java.util.Scanner;

public class PrimeNumberUptoN {

    public static void main(String[] args){
        int limit, num = 0, i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit to check for prime numbers: ");
        limit = scanner.nextInt();
        System.out.println("Prime numbers from 1 to " + limit + " are: ");

        for (i = 1; i <= limit; i++){
            int counter = 0;
            for(num = i; num >= 1; num--){
                if(i % num == 0){
                    counter = counter + 1;
                }
            }
            if(counter == 2){
                System.out.print(i + " ");
            }
        }
    }
}

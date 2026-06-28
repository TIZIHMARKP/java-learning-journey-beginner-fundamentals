package javaBasicPrograms;

import java.util.Scanner;

public class NumberToWords {

    public void pw(int n, String ch){
        String one[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", " Eighteen", "Nineteen"};

        String ten[] = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if(n > 0){
            if(n > 19){
                System.out.print(ten[n/10] + " " + one[n % 10]);
            } else {
                System.out.println(one[n]);
            }

            if(!ch.isEmpty()){
                System.out.println(" " + ch);
            }
        }


    }

    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to get it's word: ");
        n = scanner.nextInt();

        System.out.println(n);
        if(n <= 0){
            System.out.println("Enter numbers greater than 0");
        } else {
            NumberToWords a = new NumberToWords();
            a.pw((n / 10000000) % 100, "crore");
            a.pw((n / 100000) % 100, "lakh");
            a.pw((n / 1000) % 100, "thousand");
            a.pw((n / 100) % 10, "hundred");
            a.pw((n % 100), "");
        }
    }

}

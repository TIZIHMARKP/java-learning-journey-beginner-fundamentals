package javaBasicPrograms;

public class PalindromeUptoN {
    public static void main(String[] args){
        int n, b, rev = 0;
        int limit = 50;

        System.out.println("Palindrome numbers from 1 to N: ");

        for(int i = 1; i <= limit; i++){
            n = i;
            while (n > 0){
                b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;
            }
            if(rev == i){
                System.out.println(i + " ");
            }
            rev = 0;
        }
    }
}

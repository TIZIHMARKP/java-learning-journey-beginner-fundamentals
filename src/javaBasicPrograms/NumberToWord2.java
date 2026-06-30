package javaBasicPrograms;

public class NumberToWord2 {

    private static final String[] ONES = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", " Eighteen", "Nineteen"};

    // Array for tens: 20, 30, 40, .... 90
    // Index 0 is empty, index 1 is "Ten"
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static String convertToWords(int n){
        StringBuilder result = new StringBuilder();

        if(n >= 20){
            result.append(TENS[n / 10 - 1]);
        }
    }

}

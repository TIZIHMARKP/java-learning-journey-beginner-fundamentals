package javaBasicPrograms;

public class NumberToWord2 {

    private static final String[] ONES = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", " Eighteen", "Nineteen"};

    // Array for tens: 20, 30, 40, .... 90
    // Index 0 is empty, index 1 is "Ten"
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    // Converting a number between 0 - 99 to words
    private static String convertToWords(int n){
        StringBuilder result = new StringBuilder();

        if(n >= 20){
            result.append(TENS[n / 10 - 1]);

            if(n % 10 != 0){
                result.append("-").append(ONES[n % 10]);
            }
        } else if(n > 0){
            result.append(ONES[n]);
        }

        return result.toString();
    }

    // Converting a whole number to words which supports up to 99,999,999


}

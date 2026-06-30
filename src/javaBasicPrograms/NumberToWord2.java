package javaBasicPrograms;

public class NumberToWord2 {

    // Array for number words
    private static final String[] ONES = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", " Eighteen", "Nineteen"};

    // Array for tens: 20, 30, 40, .... 90
    private static final String[] TENS = {"", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    // Converting a number between 0 - 99 to words
    private static String convertToWords(int n){
        // StringBuilder is more efficient than String concatenation
        // It allows us to build the string piece by piece without creating multiple String objects
        StringBuilder result = new StringBuilder();

        // Case 1: Number is 20 or > (20-99)
        if(n >= 20){
            // Reason for using n/10 - 1?
            // For n = 28: n/10 = 2
            // TENS[2] would be "Thirty" which is wrong
            // But TENS[1] = "Twenty" which is correct
            // So we subtracted 1 to map: 2 -> 1, 3 -> 2, etc
            // and this works because TENS[0] is empty
            result.append(TENS[n / 10 - 1]);

            // Checking if there's a ones place digit (not zero)
            // e.g: 28 => 28%10 = 8, so we add "-Eight"
            // e.g: 20 => 20%10 = 0, so we don't add anything
            if(n % 10 != 0){
                result.append("-").append(ONES[n % 10]);
            }
        } else if(n > 0){
            result.append(ONES[n]);
        }

        return result.toString();
    }

    // Converting a whole number to words which supports up to 99,999,999
    public static String numberToWords(int n){
        if(n == 0){
            return "Zero";
        }

        StringBuilder result = new StringBuilder();

        int[] values = {10000000, 100000, 1000, 100, 1};

        // defining place values and their suffixes
        String[] suffixes = {"Crore", "Lakh", "Thousand", "Hundred", ""};

        for(int i = 0; i < values.length; i++){
            int quotient = n / values[i];
            if(quotient > 0){

                if(values[i] == 100){
                    result.append(ONES[quotient]).append(" Hundred ");
                } else {
                    result.append(convertToWords(quotient)).append(" ").append(suffixes[i]).append(" ");
                }
                n = n % values[i];
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args){
        // Testing with various numbers
        int[] testNumbers = {28, 153, 1001, 10000, 50000, 1234567, 0};

        for(int num : testNumbers){
            System.out.println(num + " = " + numberToWords(num));
        }
    }

}

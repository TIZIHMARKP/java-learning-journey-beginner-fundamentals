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

            // Case 2: Number between 1 - 19
        } else if(n > 0){
            // directly using the ONES array
            result.append(ONES[n]);
        }
        // Case 3: n = 0 returns empty string

        // converting StringBuilder to string and return
        return result.toString();
    }

    // Converting a whole number to words which supports up to 99,999,999
    public static String numberToWords(int n){
        if(n == 0){
            return "Zero";
        }

        // StringBuilder to build the final result
        StringBuilder result = new StringBuilder();

        int[] values = {10000000, 100000, 1000, 100, 1};

        // defining place values and their suffixes using Indian Numbering System
        String[] suffixes = {"Crore", "Lakh", "Thousand", "Hundred", ""};

        // Looping through each place value from largest to smallest
        for(int i = 0; i < values.length; i++){
            // Calculatx how many of this place value are in the number
            // e.g: n = 1234567, values[i]=100000 => 1234567/100000 = 12
            int quotient = n / values[i];

            // Only processing if quotient > 0 (if this place value exist in the number)
            if(quotient > 0){

                /** Special case for "Hundred"
                - When values[i] == 100, quotient will be 0-9 which is a single digit
                - e.g: 153 => 153/100 = 1 => "One Hundred"
                - We use ONES[quotient] directly coz it's a single digit
                */
                if(values[i] == 100){
                    result.append(ONES[quotient]).append(" Hundred ");
                } else {
                    /**
                     - For all other place values (Crore, Lakh, Thousand, and units)
                     - The quotient can be 2 digits (e.g., 12 Lakh, 34 Thousand)
                     - So we use convertToWords() to handle numbers 0-99
                     */

                    // Appending the word representation + suffix + space
                    result.append(convertToWords(quotient)).append(" ").append(suffixes[i]).append(" ");
                }
                // IMPORTANT: Update n to the remainder
                // After processing a place value, we only care about the remaining digits
                // Example: n=1234567, after processing Lakh (12 Lakh)
                //   n = 1234567 % 100000 = 34567 (remaining digits)
                n = n % values[i];
            }
            // if quotient == 0, skiping this place value and continue to next
        }

        // Converting StringBuilder to String and remove leading/trailing spaces
        // trim() removes extra spaces at the beginning and end
        return result.toString().trim();
    }

    public static void main(String[] args){
        // Testing with various numbers
        int[] testNumbers = {28, 153, 1001, 10000, 50000, 1234567, 0};

        // Looping through each test number & printing the result
        for(int num : testNumbers){
            System.out.println(num + " = " + numberToWords(num));
        }
    }

}

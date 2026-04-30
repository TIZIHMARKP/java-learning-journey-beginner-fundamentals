

public  static void main() {
    //  Understanding  Methods
//  Methods is a block of code which only runs when it is called. We can pass data into a method
//  We have two types of methods:
//    1. Built in methods: These are methods provided by the Java Run time environments
//    2. Predefined Methods: These are methods which we build our selfs
    char[] letters = {'A', 'A', 'B', 'C', 'D', 'D'};

    int count = countOccurrences(letters, 'A');
    System.out.println(count);

}


public static int countOccurrences(char [] letters, char searchLetter){
    System.out.println("Method countOCoccurrences was invoked");
    System.out.println(Arrays.toString(letters));
    System.out.println(searchLetter);

    // doing a search for the letter passed
    int count = 0;
    for(char letter : letters){
        if(letter == searchLetter){
            count++;
        }
    }
    return count;
}




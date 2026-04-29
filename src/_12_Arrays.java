

public  static void main() {
    //   ARRAYS
//  Arrays allows us to create more than one variable that holds more than one value

    int zero = 0;
    int one = 1;

    int [] numbers = new int[3];     // two is the size of the array
    boolean [] BoolEan = new boolean[3];     // Array of boolean

    // for defining an array without giving it a size, we make use of { }. e.g
    int [] number1 = {2, 0, 1, 4};

    String [] names = {"Ali", "Maria"};

    numbers[0] = 0;
    numbers[1] = 1;
    numbers[2] = 2;


    System.out.println(Arrays.toString(numbers));   // Outputs: [0, 1, 2]
    System.out.println(Arrays.toString(number1));   // Outputs: [2, 0, 1, 4]
    System.out.println(Arrays.toString(BoolEan));  // Outputs: [false, false, false]
    System.out.println(Arrays.toString(names));
    System.out.println(number1.length);   // Output: 5





}




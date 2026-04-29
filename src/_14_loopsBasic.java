

public  static void main() {
    //   LOOPS
//

    int [] numbers = {2, 0, 1, 4, 100, 500, 54, 21};

    int number = 0;
    number--;
    System.out.println(number);   // Output: -1

    for(int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i]);
    }

    // Reverse order
    for(int i = numbers.length - 1; i >= 0; i--){
        System.out.println(numbers[i]);
    }


}




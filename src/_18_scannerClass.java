

public  static void main() {
    //   SCANNER CLASS
//  It allows us to take user input from the console

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name? ");
    String userName = scanner.nextLine();
    System.out.println("Your name is: " + userName);

//    Taking user age then calculating the year of birth
    System.out.println("How old are you? ");
    int age = scanner.nextInt();            // getting value as int
    int year = LocalDate.now().minusYears(age).getYear();
    System.out.println("You were born in " + year);

//    Checking if Adult or Nor
    if(age < 18){
        System.out.println("You are not an Adult");
    } else {
        System.out.println("You are an Adult");
    }


}




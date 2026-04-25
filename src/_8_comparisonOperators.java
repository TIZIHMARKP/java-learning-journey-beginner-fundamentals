

public  static void main() {
    //   COMPARISON OPERATORS
//    They allow us to compare values

//    Boolean Operators. Oprators which give true or false
//    int johnAge = 18;
//    int maryAge = 20;
//    System.out.println(johnAge > maryAge);  // false
//    System.out.println(johnAge < maryAge);  // true
//    System.out.println(johnAge == maryAge); // false
//    System.out.println(johnAge != maryAge); // true
//    System.out.println(johnAge >= maryAge);
//    System.out.println(johnAge <= maryAge);

//    Logical Operators
    boolean isAdult = false;
    boolean isStudent = true;
    boolean isTizihBrand = true;
    System.out.println(isAdult && isStudent);
    System.out.println(isAdult || isStudent);
    System.out.println((isAdult || isStudent) && isTizihBrand);
    System.out.println((!isAdult || isStudent) && isTizihBrand);
    System.out.println((!isAdult || !isStudent) && isTizihBrand);
    System.out.println(isAdult == true);                             // false
    String name = "Mark";
    System.out.println(10 > 8 || 2 <= 2 && !isAdult && name.contains("M"));  // false






}





import java.util.Date;

public  static void main() {
    //    Variables
//    A variable is a place holder where you can store values
//    We have two types of Data types in Java: Primitive Datatypes and Reference datatypes
//    Primitive datatypes are used for storing simple values such as numbers and single characters
//    Reference(or objects) datatypes are used to store complex datatypes e.g finding the current date
//    Example of Primitive Datatypes: double, long
//    Example of Reference Datatypes: double, long

//    A. PRIMITIVE DATATYPES

    /*
          DATATYPE              SIZE                   DESCRIPTION

        1. byte                 1 byte                 Stores whole numbers from -128 to 127
        2. short                2 bytes                Stores whole numbers from -32,768 to 32,767
        3. int                  4 bytes                Stores whole numbers from -2,147,483,642 to 2,147,483,647
        4. long                 8 bytes                Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        5. float                4 bytes                Stores fractional numbers. Sufficient for storing 6 to decimal digits
        6. double               8 bytes                Stores fractional numbers. Sufficient for storing 15 decimal digits
        7. boolean              1 bit                  Stores true or false values
        8. char                 2 bytes                Stores a single character/letter or ASCII values
    */

    byte theByte = -128;
    short theShort = 8989;
    int number = 787_878_334;
    long theLong = 9_223_372_036_854_775_807L;  // add an 'L' at the end of long datatype
    // The four datatypes allows you to store whole numbers. The difference actually is the size in memory

    float pi = 3.14F;  // Ends with 'f' or 'F'
    double doublePi = 3.1415;  // Float is sufficient for storing 6-7 decimal digits whereas double is sufficient for storing 15 decimal digits

    boolean isAdult = true;  // Takes either true or false
    char nameInitial = 'T';

    System.out.println(theByte);
    System.out.println(theShort);
    System.out.println(number);
    System.out.println(theLong);
    System.out.println(pi);
    System.out.println(doublePi);
    System.out.println(isAdult);
    System.out.println(nameInitial);
}


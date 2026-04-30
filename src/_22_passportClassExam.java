

public  static void main() {
    //  CLASSES AND OBJECTS
//  A class is a blue print to create any thing that you want
//    Classes are made up of attributes (the things that define the actual object)
//    Behaviors of a class is what a class can do

//    === Passport Example Classes ====

    Passport ukPassport = new Passport(
            "1234",
            "ScotLand",
            LocalDate.of(2026, 4, 30)
    );
    Passport usPassport = new Passport(
            "1234",
            "America",
            LocalDate.of(2030, 4, 30)
    );

}

static class Passport {
    String number;
    String country;
    LocalDate expiryDate;

    Passport(String number, String country, LocalDate expiryDate){
        this.number = number;
        this.country = country;
        this.expiryDate = expiryDate;
    }
}











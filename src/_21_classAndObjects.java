

public  static void main() {
    //  CLASSES AND OBJECTS
//  A class is a blue print to create any thing that you want
//    Classes are made up of attributes (the things that define the actual object)
//    Behaviors of a class is what a class can do

    // Creating Objects
    Lens lensOne = new Lens(
            "sony",
            "85mm",
            true
    );
    Lens lensTwo = new Lens(
            "sony",
            "30mm",
            true
    );
    Lens lensThree = new Lens(
            "canon",
            "24-70mm",
            false
    );

//    Printing Object Attributes
    System.out.println("Lens 1");
    System.out.println(lensOne.brand);
    System.out.println(lensOne.focalLength);
    System.out.println(lensOne.isPrime);
    System.out.println();

    System.out.println("Lens 2");
    System.out.println(lensTwo.brand);
    System.out.println(lensTwo.focalLength);
    System.out.println(lensTwo.isPrime);
    System.out.println();  // printing a line

    System.out.println("Lens 3");
    System.out.println(lensThree.brand);
    System.out.println(lensThree.focalLength);
    System.out.println(lensThree.isPrime);

}

static class Lens{
    String brand;
    String model;
    String colour;
    double price;
    double weight;
    String focalLength;
    boolean isPrime;

    Lens(String brand,
         String focalLength,
         boolean isPrime
    ){
        this.brand = brand;
        this.focalLength = focalLength;
        this.isPrime = isPrime;
    }
}









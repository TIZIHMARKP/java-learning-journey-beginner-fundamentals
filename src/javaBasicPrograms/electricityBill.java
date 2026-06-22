package javaBasicPrograms;

public class electricityBill {
    public static void main(String[] args){
        int units = 123;
        int bill = 0;

        if(units > 300){
            bill = units * 8;
        } else if(units >= 200) {
            bill = units * 7;
        } else if(units >= 100){
            bill = units * 6;
        } else {
            bill = units * 5;
        }
        System.out.println("SOCADEL ELECTRICITY BILL");
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill: " + bill);
    }
}

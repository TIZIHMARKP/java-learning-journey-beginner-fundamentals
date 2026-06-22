package javaBasicPrograms;

public class electricityBill {
    public static void main(String[] args){
//        int units = 123;
//        int bill = 0;

        // === 1. USING IF ELSE  ====
//        if(units > 300){
//            bill = units * 8;
//        } else if(units >= 200) {
//            bill = units * 7;
//        } else if(units >= 100){
//            bill = units * 6;
//        } else {
//            bill = units * 5;
//        }
//        System.out.println("SOCADEL ELECTRICITY BILL");
//        System.out.println("Units Consumed : " + units);
//        System.out.println("Total Bill: " + bill);

        // ==== 2. USING TERNARY OPERATOR =====
//        int units = 123;
//
//        int bill = (units > 300) ? units * 8 :
//                (units >= 200 ) ? units * 7 :
//                        (units >= 100) ? units * 6 :
//                                units * 5;
//
//        System.out.println("SOCADEL ELECTRICITY BILL");
//        System.out.println("Units Consumed : " + units);
//        System.out.println("Total Bill: " + bill);

        // ====== 3. USING ARRAY LOOKUP ======
        int units = 123;

        int [][] rateSlabs = {
                {300, 8},
                {200, 7},
                {100, 6},
                {0, 5}
        };

        int bill = calculateBill(units, rateSlabs);

        System.out.println("SOCADEL ELECTRICITY BILL");
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Bill: " + bill);

    }

    private static int calculateBill(int units, int[][] rateSlabs){
        for(int[] slab : rateSlabs){
            if(units > slab[0]){
                return units * slab[1];
            }
        }
        return units * 5;
    }


}


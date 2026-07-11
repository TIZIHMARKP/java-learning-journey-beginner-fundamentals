package javaBasicPrograms;

public class PyramidPattern1 {
    public static void main(String[] args){
        int n = 4, i, j;
        for(i = 0; i < n; i++){
//            System.out.println("\n");
            for(j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

}

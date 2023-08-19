package Discount_Applicability;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double purchaseAmount = scan.nextDouble();
        checkDiscount(purchaseAmount);
        scan.close();
    }
    public static void checkDiscount(double purchaseAmount){
        if(purchaseAmount>100){
            System.out.println("Discount Applicable");
        }
    }
}

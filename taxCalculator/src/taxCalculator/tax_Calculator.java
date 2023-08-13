package taxCalculator;

import java.util.Scanner;

public class tax_Calculator {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.print("Enter the Purchase Amount : ");
	double purchase_amount=S.nextDouble();
	System.out.print("Enter the tax rate (in decimal form) : ");
	double tax_rate=S.nextDouble();
	tax_Calculator tc=new tax_Calculator();
	System.out.println("Total cost including tax : "+tc.calculateTotalWithTax(purchase_amount, tax_rate));
	S.close();
	
}
double calculateTotalWithTax(double purchase_amount, double tax_rate) {
	double tax=purchase_amount * tax_rate;
	return tax+purchase_amount;
}
}

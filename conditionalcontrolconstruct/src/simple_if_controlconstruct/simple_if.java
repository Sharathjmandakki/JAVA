package simple_if_controlconstruct;

import java.util.Scanner;

public class simple_if {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=S.nextInt();
		System.out.println("Wellcome to Kodnest");
		S.close();
		if(marks>=80) {
			System.out.println("Wellcome to Tech club");
		}
	}

}

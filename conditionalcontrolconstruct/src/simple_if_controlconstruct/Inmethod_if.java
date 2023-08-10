package simple_if_controlconstruct;

import java.util.Scanner;

public class Inmethod_if {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=s.nextInt();
		System.out.println("Wellcome to Kodnest");
		check(marks);
		s.close();
	}
	public static void check(int marks) {
		if(marks>=80) {
		System.out.println("Wellcome to Tech Club");}
	}
}

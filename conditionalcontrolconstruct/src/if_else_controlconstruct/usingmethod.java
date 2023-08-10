package if_else_controlconstruct;

import java.util.Scanner;

public class usingmethod {
public static void main(String[] args) {
	System.out.println("Enter your age");
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	eligible(age);
	s.close();
}
public static void eligible(int age) {
	if(age>=18) {
		System.out.println("You are eligible to vote");
	}else {
		System.out.println("your are not eligible to vote");
	}
}
}

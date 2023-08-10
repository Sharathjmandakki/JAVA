package if_else_controlconstruct;

import java.util.Scanner;

public class inoneclass {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("your are not eligible to vote");
		}
		s.close();
	}

}

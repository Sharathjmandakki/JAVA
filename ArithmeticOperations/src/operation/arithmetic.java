package operation;

import java.util.Scanner;

public class arithmetic {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println(subtractNumbers(num1, num2));
		System.out.println("Enter two numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		System.out.println(multiplyNumbers(num1, num2));
		System.out.println("Enter two numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		System.out.println(divideNumbers(num1, num2));
		System.out.println("Enter two numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		System.out.println(findRemainder(num1, num2));
		
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}
}

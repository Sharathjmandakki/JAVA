package BitwiseSwapper;

import java.util.Scanner;

public class Bitwise_Swapper {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first integer : ");
		int num1=s.nextInt();
		System.out.print("Enter the second integer : ");
		int num2=s.nextInt();
		swapUsingBitwise(num1,num2);
		s.close();		
	}
	public static void swapUsingBitwise(int num1,int num2) {
		int temp;
		temp=num1^num2;
		System.out.println(temp);
		num1=temp^num1;
		num2=temp^num2;
		System.out.print("After swapping: First ="+num1+", Second = "+num2);
	}

}

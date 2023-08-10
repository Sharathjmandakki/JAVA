package galacticArithmetic;

import java.util.Scanner;

public class Arithmetica {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long num1=s.nextLong();
		long num2=s.nextLong();
		System.out.println(galacticAddition(num1, num2));
		s.close();
	}public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}

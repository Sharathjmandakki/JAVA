package MethodOverloadingCalculator;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the first number : ");
	double num1=s.nextDouble();
	System.out.print("Enter the second number : ");
	double num2=s.nextDouble();
	s.nextLine();
	System.out.print("Enter the operator (+, -, *, /) : ");
	char op=s.nextLine().charAt(0);
	s.close();
	System.out.println("Result :"+calculate(num1, num2,op));
}
public static double calculate(double num1,double num2,char op) {
	double res=0.0;
	switch(op) {
	case '+': res=num1+num2;break;
	case '-': res= num1-num2;break;
	case '*': res= num1*num2;break;
	case '/': res= num1/num2;break;
	default : res=0.0;System.out.println(" +, -, *, / ");break;
	}
	return res;
}
}

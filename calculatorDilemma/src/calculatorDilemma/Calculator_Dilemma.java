package calculatorDilemma;

import java.util.Scanner;

public class Calculator_Dilemma {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the operation which you want to perform like \n for addition : '+'\n for subtraction : '-'\n for multiplication : '*'\n for division : '/'");
		char operation=s.next().charAt(0);
		System.out.print("enter the first number to perform operation : ");
		int num1=s.nextInt();
		System.out.print("enter the second number to perform operation : ");
		int num2=s.nextInt();
		calculator(operation,num1,num2);		
		s.close();
	}
	public static void calculator(char operation,int num1,int num2 ) {
		switch (operation) {
		case '+':System.out.println(num1+num2);
					break;
		case '-':System.out.println(num1-num2);
					break;
		case '*':System.out.println(num1*num2);
					break;
		case '/':System.out.println(num1/num2);
					break;
		default: System.out.println("Choose any one of these '+' ,'-' '*' '/' ");
		}
	}

}

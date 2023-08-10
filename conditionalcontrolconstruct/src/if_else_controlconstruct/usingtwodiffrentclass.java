package if_else_controlconstruct;

import java.util.Scanner;

public class usingtwodiffrentclass {
public static void main(String[] args) {
	System.out.println("Enter your age");
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	checkeligibale e=new checkeligibale();
	e.check(age);
	s.close();
}
}

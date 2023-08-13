package LogicalOperatorValidator;

import java.util.Scanner;

public class logicalOperatorValidator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Is input valid (true/false) : ");
		boolean isvalid=s.nextBoolean();
		System.out.print("Does input meet a certain condition (true/false) : ");
		boolean condition=s.nextBoolean();
		System.out.println("Input is "+isValidInput(isvalid, condition));
		s.close();
	}
	public static String isValidInput(boolean isvalid,boolean condition) {
		if(isvalid&&condition) {
			return "Valid";
		}else {
			return "Invalid";
		}
	}

}

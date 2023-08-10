package stringjoiner;

import java.util.Scanner;

public class stringjoin {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first name");
	String str1=s.next();
	System.out.println("Enter the last name");
	String str2=s.next();
	System.out.println(joinString(str1,str2));
	s.close();	
}
public static String joinString(String str1,String str2) {
	return str1+" "+str2;
}
}
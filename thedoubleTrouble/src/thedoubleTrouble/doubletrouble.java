package thedoubleTrouble;

import java.util.Scanner;

public class doubletrouble {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=S.nextInt();
	System.out.println(doubleTheNumber(num));
	S.close();
}
public static int doubleTheNumber(int num) {
	return num*2;
}

}

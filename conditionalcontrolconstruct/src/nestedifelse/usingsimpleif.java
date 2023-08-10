package nestedifelse;

import java.util.Scanner;

//check it is multiple of 2 and 4
public class usingsimpleif {
	public static void main(String[] args) {
		System.out.println("Enter the number to check weather it is mulitiple of 2 and 4");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		if(num%2==0) {
			System.out.println("yes "+num+" is multiple of 2");
			if(num%4==0) {
				System.out.println("yes "+num+" is multiple of 4");	
			}
		}
	}

}

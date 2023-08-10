package nestedifelse;

import java.util.Scanner;

//check vote
public class usingifelse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		System.out.println("you have voteing card or not in 'true' or 'false' format");
		boolean check=s.nextBoolean(); 
		s.close();
		if(age>=18) {
			if(check==true) {
				System.out.println("You can vote");
			}else {
				System.out.println("please make your voteing id");
			}
		}
		else {
			System.out.println("you not gon vote you need to wait "+(18-age)+" more years to vote some one");
		}
	}
}

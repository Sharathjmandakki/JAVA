package switchstatments;

import java.util.Scanner;

public class demo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number between 0 to 7");
	int num=s.nextInt();
	switch(num) {
	case 1:System.out.println("sun");
			break;
	case 2:System.out.println("mon");
			break;
	case 3:System.out.println("tus");
			break;
	case 4:System.out.println("wed");
			break;
	case 5:System.out.println("thus");
			break;
	case 6:System.out.println("fri");
			break;
	case 7:System.out.println("sat");
			break;
	default:System.out.println("Enter the number between 0 to 7");
	}
	s.close();
}
}

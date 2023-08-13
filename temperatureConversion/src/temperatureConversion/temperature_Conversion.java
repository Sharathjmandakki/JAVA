package temperatureConversion;

import java.util.Scanner;

public class temperature_Conversion {
	public static void main(String[] args) {
		System.out.println("Wellcome to Temperature Conversion Tool");
		Scanner s = new Scanner(System.in);
		System.out.print("1. Convert Celsius to Fahrenheit \n2. Convert Fahrenheit to Celsius\nEnter your choice:");
		int choose = s.nextInt();
		float tempinc, tempinf;
		switch (choose) {
		case 1:
			System.out.println("Enter the temperature in Celsius:");
			tempinc = s.nextFloat();
			tempinf = (tempinc * 9 / 5) + 32;
			System.out.println(tempinc + "°C is equivalent to " + tempinf + "°F");
			break;
		case 2:
			System.out.println("Enter the temperature in Fahrenheit:");
			tempinf = s.nextFloat();
			tempinc = (tempinf - 32) * 5 / 9;
			System.out.println(tempinf + "°F is equivalent to " + tempinc + "°c");
			break;
		default:
			System.out.println("Enter 1 or 2");
		}
		s.close();
	}

}

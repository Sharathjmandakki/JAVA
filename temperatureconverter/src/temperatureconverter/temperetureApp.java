package temperatureconverter;

import java.util.Scanner;

public class temperetureApp {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a fahrenheit to be converted into Celsius");
	double fahrenheit=s.nextDouble();
	TemperatureConverter tc=new TemperatureConverter();
	System.out.println(tc.convertFahrenheitToCelsius(fahrenheit)+" C");
	s.close();
	
}
}

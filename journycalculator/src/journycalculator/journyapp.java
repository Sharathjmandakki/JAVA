package journycalculator;

import java.util.Scanner;

public class journyapp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the speed : ");
		double speed=s.nextDouble();
		System.out.print("enter the time : ");
		double time=s.nextDouble();
		journyapp ja=new journyapp();
		System.out.println("Distance is : "+ja.calculateDistance(speed, time));
		s.close();
	}
	public double calculateDistance(double speed,double time) {
		return speed*time;
	}

}

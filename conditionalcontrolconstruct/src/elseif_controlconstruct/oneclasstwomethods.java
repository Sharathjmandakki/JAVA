package elseif_controlconstruct;

import java.util.Scanner;

class oneclasstwomethods {
	public static void main(String[] args) {
		System.out.println("Enter your score");
		Scanner s=new Scanner(System.in);
		int score=s.nextInt();
		s.close();
		oneclasstwomethods S=new oneclasstwomethods();
		S.Score(score);//this non static method so we created a object
	}
	void Score(int score) {
		if(score>=90&&score<=100) {
			System.out.println("A+ grade");
		}
		else if(score>=80&&score<90) {
			System.out.println("A grade");
		}
		else if(score>=70&&score<80) {
			System.out.println("B grade");
		}
		else if(score>=60&&score<70) {
			System.out.println("C grade");
		}else if(score>=50&&score<60) {
			System.out.println("D grade");
		}else if(score<50){
			System.out.println("Faile");
		}else {
			System.out.println("Enter score bellow 100");
		}
	}

}

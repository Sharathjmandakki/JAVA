package elseif_controlconstruct;

import java.util.Scanner;

public class intwodiffrentclass {
public static void main(String[] args) {
	System.out.println("Enter your score");
	Scanner s=new Scanner(System.in);
	int score=s.nextInt();
	s.close();
	Gradecheck S=new Gradecheck();
	S.Score(score);
}
}

package ch01;

import java.util.Scanner;

public class GradeSwitchExam2 {
     public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.println("점수를 입력하세요(0~100):");
		int score = scanner.nextInt();
		switch(score/10) {
		case 10:
		case 9:
		case 8:
		case 7://score는 70~79
			System.out.println("합격");
			break;
	    default:
	    	System.out.println("불합격");
			
		}
	  scanner.close();
		}
}	

	



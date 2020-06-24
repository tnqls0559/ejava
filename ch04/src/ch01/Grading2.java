package ch01;

import java.util.Scanner;

public class Grading2 {
	public static void main(String[] args) {
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100)");
		int score = scanner.nextInt();
		if(score>=90) {
			if(score>95) grade="A+";
			else if(score<95) grade="A-";
			else grade="A0";// A+>95,A0==95,A-<95
		}
		else if(score>=80) {
			if (score>85) grade="B+";
			else if(score<85) grade="B-";
			else grade="B0";
		}
		else if(score>=70) {
			if (score>75) grade="C+";
			else if(score<75) grade="C-";
			else grade="C0";
		}
		else if(score>=60) 
			if (score>65) grade="D+";
			else if(score<65) grade="D-";
			else grade="D0'";
		else grade="F";
		
		System.out.println("학점은"+grade+"입니다.");
		System.out.println(score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F');
		
		scanner.close();
		

	}

}

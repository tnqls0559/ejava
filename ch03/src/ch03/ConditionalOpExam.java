package ch03;

import java.util.Scanner;
//삼항연산: 피연산자 수가 3개인 연산
public class ConditionalOpExam {
     public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int score = scanner.nextInt();
		System.out.println(score>70?"pass":"fail");
		}

	
	}



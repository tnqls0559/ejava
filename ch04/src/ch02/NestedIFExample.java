package ch02;

import java.util.Scanner;

public class NestedIFExample {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun=true;
		
	while(isRun) {
	    System.out.println("점수를 입력하세요(0~100)");
		int score = scanner.nextInt();
		if(score<0 || score>100) {
			System.out.println("입력된 값의 범위를 벗어났습니다.");
			continue;
		}		
		System.out.println("학년을 입력하세요(1~4)");
		int year = scanner.nextInt();
		if(year<1 || year>4) {
			System.out.println("학년의 범위는 1~4사이의 값입니다.");
			continue;
		}		
		if(score>=60) {//60점 이상 조건 
			if(year!=4)//1,2,3학년 //4학년 이상 조건
				System.out.println("합격!");
			else if(score>=70)//4학년 & 70이상
				System.out.println("합격!");
			else //4학년 & 70미만
				System.out.println("불합격");
		}else {//위 조건에 해당이 되지 않으면 ex)점수가 60미만
			System.out.println("불합격");
		}
		System.out.println("계속할까요?");
		char yesNo=scanner.next().charAt(0);
		if(yesNo=='n' || yesNo=='N') isRun=!isRun;
		
        }//while끝.
		   System.out.println("프로그램 종료");
}	}



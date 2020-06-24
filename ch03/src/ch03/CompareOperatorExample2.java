package ch03;

import java.util.Scanner;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		char c = 'c';
		boolean isRun = true;
		Scanner scanner = new Scanner(System.in);
		while(isRun){
		System.out.println("문자를 하나 입력하세요");
		
		c=scanner.next().charAt(0);
		
		if(c>='A' && c<='Z') {// '8' > 65 & '8' <= 90, => 56>=65 & 56<=90
			System.out.println("변수 c에 입력된 값은 대문자입니다.");
		}else if(c>='a' && c<='z') {// '8'>=97 & '8'<=122 => 56>=97 &
			System.out.println("변수 c에 입력된 값은 소문자입니다.");
		}else {
			System.out.println("변수 c에 입력된 값은 문자가 아닙니다.");
		}
		 System.out.println(c>='A' && c<='Z'?"변수 c에 입력된 값은 대문자입니다."
				           :c>='a' && c<='z'?"변수 c에 입력된 값은 소문자입니다."
						   :"변수 c에 입력된 값은 문자가 아닙니다.");
		
		
		System.out.println("계속할까요?");
		char yesNo = scanner.next().charAt(0);
		if(yesNo=='n'||yesNo=='N') {
			isRun = !isRun;
		}
		
		}//while 끝.
		 System.out.println("프로그램 종료");
		
	}

}

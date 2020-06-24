package ch01;

import java.util.Scanner;

public class CoffeePrice {
   public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun=true;
		while(isRun) {
		System.out.println("무슨 커피 드릴까요?");
		String order = scanner.next();
		int price = 0;
		
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		case "아메리카노": price=2000; break;
		default: System.out.println("메뉴에 없습니다.");
		}
		if(price !=0)
			System.out.println(order+"는"+price+"원 입니다.");
		
		System.out.println("계속할까요?");
		char yesNo=scanner.next().charAt(0);
		  if(yesNo=='n' || yesNo=='N'); isRun=false;		
		}//while문 끝.
		System.out.println("프로그램 종료");
		
		scanner.close();
}
}		
	



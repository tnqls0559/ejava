package verify;

import java.util.Scanner;

//7.while문과 Scanner 이용하여 예금, 출금, 잔고, 종료
public class Exercise0407 {
	public static void main(String[] args) {
		boolean run =true;
		
		int balance=0;//잔고 초기화
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1: System.out.println("예금액>");
			        balance+=scanner.nextInt();
			        break;
			case 2: System.out.println("출금액>");
			        int amount =scanner.nextInt();
			        if(balance - amount<0) {
			        	System.out.println("출금액이 잔고보다 많습니다.");
			        	continue;
			        }
			        balance-=amount;
			        break;
			case 3:System.out.println("잔고>"+balance);
			       break;
			case 4:run=false;
			       System.out.println("프로그램 종료");
			}
		}
		

	}

}

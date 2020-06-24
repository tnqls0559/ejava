package ch03.verify;

import java.util.Scanner;

public class StockMainExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Stock클래스(설계도)에 맞는 인스턴스 생성
		//타입 변수=new 타입();
		Stock stock = new Stock();
		
		//메소드 실행하여 stock인스턴스의 속성값 지정
		//stock.item="apple"처럼 직접적으로X
		System.out.println("상품명을 입력하세요>");
		String item = scanner.next();
		stock.setItem(item);
		System.out.println("상품 수량을 입력하세요>");
		int amount = scanner.nextInt();
		stock.setQty(amount);
		
		double qty=stock.getQty();
		//qty=stock.qty; X
		System.out.println("현재고:"+qty);
		
		System.out.println("출고 수량을 입력하세요>");
		amount = scanner.nextInt();
		stock.outQty(amount);
		qty=stock.getQty();
		System.out.println("현재고:"+qty);

	}

}

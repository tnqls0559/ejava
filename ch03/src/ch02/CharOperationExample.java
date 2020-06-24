package ch02;

public class CharOperationExample {

	public static void main(String[] args) {
		//리터럴끼리 연산한 결과 타입은 변하지 않음
		char c1 = 'A'+1;//char타입 리터럴 'A' +1=>'B'
		char c2 = 'A';
		//char c3 = c2 +1;//char타입 변수값 int차입 리터럴 + 연산 =>int타입 값
		
		System.out.println("c1"+c1);
		System.out.println("c2:"+c2);
		System.out.println("c3:"+c2+1);
		
	}

}

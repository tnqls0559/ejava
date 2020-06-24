package ch06.ch02;
//기본 타입의 값이 메소드의 매개값으로 전달될때는 값이 복사되어 전달됨.
public class ValuePassingExample {

	public static void main(String[] args) {
		int n = 10;
		//n의 값 10은 복사되어서 increase 함수의 매개값으로 전달됨.
		increase(n);
		
		System.out.println("n:"+n);
		
	}
	//매개변수(인자,아규먼트,인수)를 받고 값을 리턴하지 않는 메소드
	static void increase(int m) {
		m = m+1;
		System.out.println("m:"+m);
	}

}

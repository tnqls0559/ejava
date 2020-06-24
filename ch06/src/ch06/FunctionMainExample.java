package ch06;

public class FunctionMainExample {

	public static void main(String[] args) {
		FunctionExam fe = new FunctionExam();
		//매개변수 받고 리턴 타입이 잇는 메소드 호출
		double result = fe.method1(10, 20);
		System.out.println(result);
		
		//매개변수 받고 리턴 타입이 없는 메소드 호출
		fe.method2(10, 20);
		
		fe.x=20.0; fe.y=30.0;
		//매개변수 받지 않고 리턴 타입이 있는 메소드 호출
		result = fe.method3();
		System.out.println(result);
		
		//매개변수 받지 않고 리턴 타입이 없는 메소드 호출
		fe.method4();

	}

}

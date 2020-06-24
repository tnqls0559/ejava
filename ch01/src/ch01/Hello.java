package ch01;

public class Hello {//클래스블럭

	public static void main(String[] args) {//메소드블럭
		System.out.println("Hello, javaworld");//실행문(명령문)
		hello();//동일 클래스내에서 다른 함수(메소드) 호출
     }

	public static void hello() {//메소드명은 소문자로 시작
		String hello="hello";//변수명은 소문자로 시작
		System.out.println(hello);
	}
}

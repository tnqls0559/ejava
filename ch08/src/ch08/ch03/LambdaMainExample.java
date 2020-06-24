package ch08.ch03;

public class LambdaMainExample {
	public static void main(String[] args) {
		//무명(anonymous interface)
		MyFunctionalInterface mi = new MyFunctionalInterface() {
			@Override
			public int sum(int x, int y) {
				return x+y;
			}			
		};
		
		System.out.println(mi.sum(10,20));
		
		MyFunctionalInterface mi2 = new MyClass();//promotion
		System.out.println(mi2.sum(10, 20));
		//람다식
		//대입되는 인터페이스의 타입을 자바가 알고있음=
		//인터페이스에는 추상 메소드가 오직 하나여야만 함.
		//=오른쪽 인터페이스명과 메소드명은 삭제,
		//매개변수의 타입 삭제 변수명만, 표시
		//()->{}화살표로 표시
		//{}안에 명령문이 하나면 {}삭제 가능, return문도 삭제가능.
		MyFunctionalInterface mi3 = (x,y)->x+y;
		System.out.println(mi3.sum(10, 20));
			 
			
			
			
		

	}
}

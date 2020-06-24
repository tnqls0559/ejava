package ch03.ch04;

public class A {
    void method1(int x, int y) {
    	System.out.println("A:"+(x+y));
    }
}
class B extends A{
	//재정의 된 메소드
	void method1(int x, int y) {
		System.out.println("B:"+(x+y));
	}
	//method1을 호출하는 메소드
	//this.메소드:자신의 클래스의 다른 메소드를 호출
	//super.메소드:부모의 재정이 이전의 메소드 호출
	void method2(int x, int y) {
		if(x>y) this.method1(x,y);
		else
			super.method1(x,y);
	}
class C extends B{
		void method2(int x, int y) {
			super.method2(x, y);//부모클래스의 메소드 호출
		}
		
		void method1(int x, int y) {
			super.method1(x, y);//부모클래스의 메소드 호출
		}
	}
}
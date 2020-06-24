package ch03.ch03;

public class A {
	void method1(int x,int y) {
		System.out.println("A:"+(x+y));
	}
}
class B extends A{
	//재정의한 메소드-override
	void method1(int x, int y) {
		System.out.println("B:"+(x+y));
	}
	//overloding
	void method1(double x, double y) {
		System.out.println(x+y);
	}
	//overloding
	int method1(double x, int y) {
		return (int)(x+y);
	}
}
package ch04.ch01;

public class A {
	final double PI = 3.141592;
	//final�� ����� �޼ҵ�� �ڽ� Ŭ�������� ������ �Ұ�
	void method1() {
		System.out.println("������ �Ұ� �޼ҵ�");
	}
}

class B extends A{
	void method1() {
		System.out.println("�ڽ� Ŭ�������� ������ �� �޼ҵ�");
	}
}

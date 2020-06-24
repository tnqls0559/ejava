package ch13.ch05.package2;

import ch13.ch03.package1.B;

public class A {
    void f() {
    	//클래스 public 접근가능
    	B b = new B();
    	//멤버는 default 접근불가
    	//b.n = 3;
    	//b.g();
    }
}

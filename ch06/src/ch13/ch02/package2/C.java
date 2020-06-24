package ch13.ch02.package2;
//접근제한자 public이면
//동일패키지/다른패키지의 클래스에서 접근가능
import ch13.ch02.package1.B;
public class C {
	ch13.ch02.package1.A a = new ch13.ch02.package1.A();
    B b = new B();
}

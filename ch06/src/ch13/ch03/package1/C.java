package ch13.ch03.package1;

public class C {
  public void k() {
	  B b = new B();//동일 패키지 클래스 접근가능
	  b.n = 7;//동일 패키지 멤버(필드) 접근가능
	  b.g();//동일 패키지 멤버(메소드) 접근가능
  }
}

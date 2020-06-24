package ch13.ch05.package1;

public class C {
	public void k() {
	//클래스 접근가능
	 B b = new B() ;
	//동일 패키지 내 멤버 접근가능
	 b.n = 7;
	 b.g();
	}

}

package ch01;
//접근지정자 class 클래스명{}
//속성+메소드+생성자를 묶어서 하나의 클래스를 생성
public class FishBread {
	static int seq=0;
	//속성
	String name;
	int no;
    //생성자-생성된 객체의 초기화 역할
	//접근지정자 클래스명(){실행문;}
	public FishBread() {
		no=++seq;
		System.out.println(no+"번째 붕어빵 탄생");}
	//메소드
	//접근지정자 리턴타입 메소드명(){실행문;}
	public void method1() {
		System.out.println(name);
		
	}	
}
	



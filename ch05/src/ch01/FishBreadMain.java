package ch01;

public class FishBreadMain {

	public static void main(String[] args) {
		FishBread f1 = null;//main 메소드 내에서 선언 로컬참조변수 초기화 null
		System.out.println(f1==null);//객체와 연결 전
		f1 = new FishBread();
		
		System.out.println(f1==null);//객체와 연결 후		
		FishBread f2 = new FishBread();		
		
		FishBread f3 = new FishBread();
		System.out.println(f3==null);//객체와 연결 중 false;
		f3=null;//f3가 가르키는 인스턴스(객체)와의 참조관계가 끊어짐.
		System.out.println(f3==null);//객체와 연결이 끊어짐 true

		f1.name="첫번째";
		f2.name="두번째";
				
		try {
		f3.name="세번째";
		}catch(Exception e) {
			System.out.println("f3가 가르키는 인스턴스는 없어요!");
		}
		 f1.method1();
		 f2.method1();
		try {
		 f3.method1();
		}catch(Exception e)  {
			System.out.println("f3가 가르키는 인스턴스가 없어서 호출불가");
		}
		System.out.println("총 만들어진 붕어빵 갯수:"+FishBread.seq);
		//char c1=10;
		//char c2=10;
		//char c3=10;
		
		}
	}


package ch01;
//클래스 - 속성(변수) + 메소드(함수)
//소스코드 작성시 extends Object 부분이 없으면
//컴파일시 extends Object 부분을 추가하여 컴파일
//Class 파일에는 항상 extends Object 부분이 추가됨.
public class ClassExam/* extends Object*/{
	//생성자
	public ClassExam() {
		System.out.println("ClassExam의 defalut생성자");
	}
	static int num=10;//static의 변수
	public static void method1() {//static의 메소드
		System.out.println("static메소드");	
	}
	//main 메소드
	public static void main(String[] args) {
		//instance생성
		ClassExam c=new ClassExam();//첫번째 생성 인스턴스
		//instance에 있는 메소드 호출(실행)
		c=new ClassExam();//두번째 생성 인스턴스
		ClassExam.method1();
		//클래스의 static변수 출력
		System.out.println(ClassExam.num);
	}

}

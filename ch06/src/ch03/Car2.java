package ch03;

public class Car2 extends Vehicle{
	//생성자-기본생성자(default생성자)
	Car2(){
		System.out.println("Car2 생성자");
	}
	//speed변수 재정의
	int speed=0;
	//메소드 재정의
	void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	//메소드 추가
	void fullSpeedUp() {
		speed=5;
	}

}

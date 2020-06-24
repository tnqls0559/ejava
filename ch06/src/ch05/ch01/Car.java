package ch05.ch01;

public class Car {
	//필드
	//고유속성
	String company = "현대";//제조사
	String model = "sonata";//모델
	String color = "red";//색상
	int maxSpeed = 220;//최고속도
	int year = 2020;//제조연도
	
	//현재상태
	int speed;//현재속도 0으로 초기화 됨.
	int rpm;//현재rpm 0으로 초기화됨.
	boolean isStop;//현재 정지상태여부 false로 초기화됨.
	
	//부품
	Body body = new Body();
	Engine engine;
	Tire tire;//null로 초기화됨.
	//생성자
	//메소드
	void run() {
		int count=0;
		count++;
		speed++;
	}
}
class Body{}
class Engine{}
class Tire{}

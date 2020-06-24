package ch03;

public class Vehicle {
	//생성자-기본생성자(default생성자)
	Vehicle(){
		System.out.println("Vehicle객체 생성자");
	}
	//속성
	private int speed;
	//기능
	void run() {
		System.out.println("달린다.");
	}
	void stop() {
		System.out.println("정지한다.");
	}
    void speedUp() {
    	if(++speed>5) speed=5;
    	//speed++;
    }
    void speedDown() {
    	if(--speed<0) speed=0;
    	//speed--;
    }
    void getSpeed() {
    	System.out.println(speed);
    }

}

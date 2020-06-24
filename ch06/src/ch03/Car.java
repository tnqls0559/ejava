package ch03;

public class Car {
	//속성
	int speed;
	//기능
	void run() {
		System.out.println("달린다.");
	}
	void stop() {
		System.out.println("자동차가 정지합니다.");
	}
    void speedUp() {
    	//if(++speed>5) speed=5;
        speed++;
    }
    void speedDown() {
    	if(--speed<0) speed=0;
    	//speed--;
    }
    void getSpeed() {
    	System.out.println(speed);
    }
  //메소드 추가
  	void fullSpeedUp() {
  		speed=5;
  	}
}

package ch03;

public class Car {
	//�Ӽ�
	int speed;
	//���
	void run() {
		System.out.println("�޸���.");
	}
	void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
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
  //�޼ҵ� �߰�
  	void fullSpeedUp() {
  		speed=5;
  	}
}

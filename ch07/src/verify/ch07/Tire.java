package verify.ch07;

public class Tire {
	public void run() {
		System.out.println("�Ϲ� Ÿ�̾ �������ϴ�.");
	}
}

class SnowTire extends Tire{
//������
	@Override
	public void run() {
		System.out.println("����� Ÿ�̾ �������ϴ�.");
	}
	
}
package ch04.ch02;

public class Employee {
	private String name;
	int sal;
	private final float INCENTIVE_RATE=0.1f;
	public Employee(String name) {
		this.name = name;
	}
	int computePay() {
		return 0;
	}
	final int computeIncentive() {
		int pay = computePay();
		int bonus = 0;
		if(pay>10000) {
			bonus = (int)(pay*INCENTIVE_RATE);
		}
		return bonus;
	}
	//재정의 가능한 메소드
	void print() {
		System.out.println("========================");
		System.out.println("이름:"+name);
		System.out.println("급여:"+sal);
		System.out.println("보너스:"+computeIncentive());
	}

}

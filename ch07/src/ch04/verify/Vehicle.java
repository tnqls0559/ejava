package ch04.verify;

public abstract class Vehicle {
	final int MAX_FEE = 50000;
	String kind;
	int feePerTime;//시간당주차비
	int intTime;//입차시각
	int outTime;//출차시각
	
	public Vehicle(String kind, int feePerTime, int intTime, int outTime) {
		this.kind = kind;
		this.feePerTime = feePerTime;
		this.intTime = intTime;
		this.outTime = outTime;
	}
    //반드시 재정의 되어야함.
	abstract int calcTime();{}
	
	final int calcFee() {
		int time = calcTime();
		if(time>12) return MAX_FEE;
		else{
			return time*getFeePerTime();
		}
	}
	
	int getFeePerTime() {
		return feePerTime;
	}
	
	void print() {
			System.out.println("================");
			System.out.println("차종:"+kind);
			System.out.println("주차시간:"+calcTime());
			System.out.println("주차요금:"+calcFee());
	 }

}



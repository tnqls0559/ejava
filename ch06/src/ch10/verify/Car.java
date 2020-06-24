package ch10.verify;

public class Car {
	
	public String kind;//sedan, truck, suv
	public int inTime;
	public int outTime;
	//»ı¼ºÀÚ
	public Car(String kind, int inTime) {
		this.kind = kind;
		this.inTime = inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	
	

}

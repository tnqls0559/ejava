package ch04.ch02;

public class HourlyMan extends Employee{
	//필드
	int workHour,moneyPerHour;

	public HourlyMan(String name, int workHour, int moneyPerHour) {
		super(name);
		this.workHour = workHour;
		this.moneyPerHour = moneyPerHour;
	}
    //월급/시급 직원에 따른 급여 산출을 위해 메소드 재정의
	@Override
	int computePay() {
		return workHour*moneyPerHour;//근무시간*시급
	}
	
	

}

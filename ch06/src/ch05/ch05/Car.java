package ch05.ch05;

public class Car {
	//필드
	String company;
	String model;
	int year;
	//생성자
	Car(String company){//Default생성자
		this.company=company;//매개변수 String 1개짜리 생성자
	}
	Car(String company,String model){//매개변수 String,String 2개짜리 생성자
		this.company=company;
		this.model=model;
	}
	//매개변수 String,String,String 3개짜리 생성자
	Car(String company,String model,int year){
		this.company=company;
		this.model=model;
		this.year=year;
	}
	//매개변수의 타입,갯수,순서가 다르면 다른 생성자로 인식
	Car(String company,int year,String model){
		this.company=company;
		this.model=model;
		this.year=year;
	}	
	Car(int year,String model,String company){
		this.company=company;
		this.model=model;
		this.year=year;
	}
	//매개변수명은 무관
	//Car(int year,String model,String company){
		//this.company=company;
		//this.model=model;
		//this.year=year;
	//}
	//메소드
	public Car() {
		// TODO Auto-generated constructor stub
	}

}

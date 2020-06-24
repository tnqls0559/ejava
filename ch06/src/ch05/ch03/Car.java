package ch05.ch03;

public class Car {
    String model;
    String company;
    int maxSpeed;
    
    //매개변수가 있는 생성자가 소스코드에 있으면 기본생성자를 class에 추가하지않음.
    //기본생성자도 필요하면, 기본생성자도 소스코드에 등록해줘야함.
    //Car(){}
    //기본생성자(DefaultConstructor)는 없고
    //매개변수가 3개인 생성자만 있음.
    Car(String model, String company, int maxSpeed){
    	this.model=model;
    	this.company=company;
    	this.maxSpeed=maxSpeed;
    }
}

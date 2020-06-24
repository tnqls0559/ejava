package ch06;

public class Student {
	//매개변수를 받고 객체를 리턴하는 메소드
	//세계의 값 name(String),Gender(char)'F','M',age(int)
	//Person을 생성하는 메소드를 만드세요.
	//리턴 타입은 Person입니다.
	//타입 메소드명(매개변수1,매개변수2,매개변수3){return 결과}
	//"홍길동",'M',13
	Person getPerson(String name, char gender, int age) {
		//Person p =new Person(name,gender,age);
		//return p; 
		return new Person(name,gender,age);
	}
	

}

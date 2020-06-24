package ch05.ch05;

public class CarMainExample {

	public static void main(String[] args) {
		
		//객체(instance)생성시 초기필드값으로 주어진
		//값의 수가 다를 수 있음.
		//생성자 실행시 매개변수를 타입에 맞게 찾아서 해당 생성자 호출
		Car car1 = new Car();//()
		Car car2 = new Car("현대");//(String)
		Car car3 = new Car("현대","소나타");//(String,String)
		Car car4 = new Car(2020,"현대","소나타");//(int,String,String)
		Car car5 = new Car("현대",2020,"소나타");//(String,int,String)
		Car car6 = new Car("현대","소나타",2020);//(String,String,int)

	}

}

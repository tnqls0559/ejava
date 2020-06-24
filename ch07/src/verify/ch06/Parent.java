package verify.ch06;

public class Parent {
	public String nation;

	public Parent() {
		this("대한민국");//자기 클래스의 다른 매개변수 생성자 호출
		System.out.println("Parent() call");//2
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");//1
	}
}

class Child extends Parent{
	private String name;
	public Child() {
		this("홍길동");//자기 클래스의 다른 생성자 호출
		System.out.println("Child() call");//4
	}
	public Child(String name) {
		//super();
		this.name = name;
		System.out.println("Child(String name) call");//3
	}
}
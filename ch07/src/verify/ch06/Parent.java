package verify.ch06;

public class Parent {
	public String nation;

	public Parent() {
		this("���ѹα�");//�ڱ� Ŭ������ �ٸ� �Ű����� ������ ȣ��
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
		this("ȫ�浿");//�ڱ� Ŭ������ �ٸ� ������ ȣ��
		System.out.println("Child() call");//4
	}
	public Child(String name) {
		//super();
		this.name = name;
		System.out.println("Child(String name) call");//3
	}
}
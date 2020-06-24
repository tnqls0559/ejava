package ch05.ch08;

public class FruitMainExample {

	public static void main(String[] args) {
		Fruit apple = new Fruit("apple",2000,Brix.LOW);
		System.out.println(apple.getKind());
		System.out.println(apple.getPrice());
		System.out.println(apple.getBrix());
		apple.setSale(20);
		System.out.println(apple.getSale());
		

	}

}

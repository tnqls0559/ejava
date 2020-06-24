package ch05.ch07;

public class FruitMainExample {

	public static void main(String[] args) {
		Fruit apple = new Fruit();
		apple.setKind("apple");
		apple.setPrice(2000);
		apple.setBrix(Brix.valueOf("Low"));
		
		Fruit[] fruits = {
			
				new Fruit("banana",5000,Brix.valueOf("MEDIUM")),
				new Fruit("mango",10000,Brix.HIGH),
				new Fruit("grape",7000,Brix.valueOf("HIGH")),
		};
		
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i].toString());
		}

	}

}

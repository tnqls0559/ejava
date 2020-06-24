package ch05.ch06.verify;

public class FruitMainExam {

	public static void main(String[] args) {
		//배열로 저장
		
		Fruit[] fruits = {
				new Fruit("apple",2000,Brix.LOW),
				new Fruit("banana",5000,Brix.valueOf("MEDIUM")),
				new Fruit("mango",10000,Brix.HIGH),
				new Fruit("grape",7000,Brix.valueOf("HIGH")),
		};
		//향상된 for문
		for(Fruit f:fruits)
			System.out.println(f.toString());
		//for문
		for(int i=0;i<fruits.length;i++) {
			Fruit f = fruits[i];
			System.out.println(f.toString());//toString()이 자동 호출되서 없어도 됨.
		}
	}

}

package ch05.ch08;

import java.util.Scanner;

//Scanner�� ���� �Է¹޾Ƽ� Fruit ��ü�� ������ �迭�� �����Ͽ� �迭�� ����,
//�Ǹż����� ���� �������� ����
//�Ǹŷ��� ���� ���� ���ϰ� 
//�Ǹŷ��� ���� ���� ���� ���
//���Ǹžװ� ����Ǹž� ���
public class FruitMainExample2 {
	
	    Scanner scanner = new Scanner(System.in);
	    String kind = scanner.next();
	    int price = scanner.nextInt();
	    String brix = scanner.next();
			

	public static void main(String[] args) {
		Fruit apple = new Fruit("apple",2000,Brix.LOW);
		Fruit banana = new Fruit("banana",5000,Brix.valueOf("MEDIUM"));
		Fruit mango = new Fruit("mango",10000,Brix.valueOf("HIGH"));
		Fruit grape = new Fruit("grape",7000,Brix.valueOf("HUGH"));
	    
		
		
		System.out.println(grape);
		//�Ǹż���
		apple.setSale(20);	
	    banana.setSale(50);	
	    mango.setSale(35);	
	    grape.setSale(40);	
	    
	    Fruit[] fruits = {
	    		apple,banana,mango,grape
	    };
	    for(int i=0;i<fruits.length;i++) {
	    	Fruit fruit = fruits[i];
	    	System.out.println(fruit.getKind()+":"+fruit.getSale());
	    }
		
		
	}
}

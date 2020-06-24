package ch05.ch08.verify;
import java.util.Scanner;
//Scanner로 값을 입력받아서 Fruit 객체를 생설해 배열에 저장하여 배열에 저장,
//판매수량에 따른 오름차순 정렬
//판매량이 가장 적은 과일과 
//판매량이 가장 많은 과일 출력
//총판매액과 평균판매액 출력
public class FruitMainExample2 {
	public static void main(String[] args) {
	
	    Scanner scanner = new Scanner(System.in);
	    //Fruit 배열생성
	    Fruit[] fruits = new Fruit[4];
	    
	    for(int i=0;i<fruits.length;i++) {
	    System.out.println("과일명을 입력하세요>");
	    String kind = scanner.next();
	    System.out.println("가격을 입력하세요>");
	    int price = scanner.nextInt();
	    System.out.println("당도(LOW,MEDIUM,HIGH)를 입력하세요>");
	    String brix = scanner.next();
			
        Fruit fruit = new Fruit(kind,price,Brix.valueOf(brix));
        fruits[i]=fruit;
 }
	    //Fruit f = fruits[0]; f.setSale(20);
	    System.out.println("과일별 판매수량 입력");    
	    for(int i=0;i<fruits.length;i++) {
	    System.out.println("수량을 입력하세요>");
	    int sale = scanner.nextInt();
	    fruits[i].setSale(sale);
	    }
	    System.out.println("정보 출력");
	    for(int i=0;i<fruits.length;i++)
	    	System.out.println(fruits[i].toString());
	    
	   double tot=0;
	    //오름차순  
	    for(int i=0;i<fruits.length;i++) {
	    	for(int j=i+1;j<fruits.length;j++) {
	    		if(fruits[i].getSale()>fruits[j].getSale()){
	    		 Fruit f = fruits[i];
	    		 fruits[i] = fruits[j];
	   		 fruits[j] = f;
	    			}
	    	}
	    }
	    //합계계산
	    for(int i=0;i<fruits.length;i++)
	    	tot+=fruits[i].getPrice()*fruits[i].getSale();
	    
	    System.out.println("정렬 후 정보 출력");
	    for(int i=0;i<fruits.length;i++)
	    	System.out.println(fruits[i].toString());
	    
	    System.out.println("최소판매량 과일정보:"+fruits[0]);
	    System.out.println("최대판매량 과일정보:"+fruits[fruits.length-1]);
	    System.out.println("총판매액:"+tot);
	    System.out.println("평균판매액:"+tot/fruits.length);
	    
		//Fruit apple = new Fruit("apple",2000,Brix.LOW);
		//Fruit banana = new Fruit("banana",5000,Brix.valueOf("MEDIUM"));
		//Fruit mango = new Fruit("mango",10000,Brix.valueOf("HIGH"));
		//Fruit grape = new Fruit("grape",7000,Brix.valueOf("HiGH"));
	    
		
		/*
		System.out.println(grape);
		//판매수량
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
		
		*/
	}
}

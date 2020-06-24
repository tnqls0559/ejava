package ch05.ch06.verify;

public class Fruit {
	private String kind;
	private int price;
	private Brix brix;
	
	//생성자 - 오버로딩
	Fruit(String kind){
		this.kind=kind;
	}
	Fruit(String kind,int price){
		this(kind);
		this.price=price;
	}
	Fruit(String kind,int price,Brix brix){
		this(kind,price);
		this.brix=brix;
	}
	public String toString() {
		return kind+","+price+","+brix;
	}
	
}

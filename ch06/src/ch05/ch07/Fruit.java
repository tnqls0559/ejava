package ch05.ch07;
//bean 생성규칙
//클래스의 속성은 private로 캡슐화
//생성자 오버로딩,
//메소드는 get+속성,set+속성명을 지정
public class Fruit {
	//필드
	private String kind;
	private int price;
	private Brix brix;
	
	//생성자
	public Fruit() {}
	public Fruit(String kind) {
		this.kind = kind;
	}
	public Fruit(String kind, int price) {
		this.kind = kind;
		this.price = price;
	}

	public Fruit(String kind, int price, Brix brix) {
		this.kind = kind;
		this.price = price;
		this.brix = brix;
	}
	@Override//재정의 했음을 알리는 주석
	public String toString() {
		return "Fruit [kind=" + kind + ", price=" + price + ", brix=" + brix + "]";
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrix(Brix brix) {
		this.brix = brix;
	}

	
	
	
}

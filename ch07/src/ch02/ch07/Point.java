package ch02.ch07;

public class Point {
	//상속에서 제외는 private점근자로 선언된 필드
	private int x,y;//한 점을 구성하는 x,y좌표
    //default생성자
	public Point() {this.x=this.y=0;}
    //매개변수 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//메소드
    public void showPoint() {
    	System.out.println("("+x+","+y+")");
    }
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x,int y,String color) {
		super(x,y);//super() 메소드에 의해 부모클래스의 매개변수 생성자 선택
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
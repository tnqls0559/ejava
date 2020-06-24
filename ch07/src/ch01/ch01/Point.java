package ch01.ch01;

public class Point {
	//private로 접근 제한한 멤버는 상속 불가
	private int x, y;
	//public으로 접근 제한한 멤버는 상속 가능
	public void set(int x,int y) {
		this.x=x;
		this.y=y;		
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
//단일상속
class ColorPoint extends Point{
	//자식클래스에서 추가된 멤버
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();//부모클래스의 public 접근제한자로 선언된 메소드 호출
	}
}

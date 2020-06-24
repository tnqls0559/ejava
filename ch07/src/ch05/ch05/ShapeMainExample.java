package ch05.ch05;

public class ShapeMainExample {
 static void print(Shape p) {//메소드의 매개 변수에서 객체의 다형성 실현
	 p.draw();
 }
	public static void main(String[] args) {
		print(new Shape());
		print(new Line());//Shape p = new Line();//promotion
		print(new Rectangle());//Shape p = new Rectangle();//promotion
		print(new Circle());//Shape p = new Circle();//promotion
	}
}

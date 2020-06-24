package ch01.ch01;

public class ColorPointEx {
	public static void main(String[] args) {
		//부모객체 생성
		Point p = new Point();
		p.set(1, 2);//부모객체의 private접근 제한된 멤버에 접근
		p.showPoint();//public으로 선언된 showPoint()로 private에 접근
		
		//자식객체 생성
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);//Point객체(부모)의 set메소드 호출
		cp.setColor("red");//자식객체에서 추가한 메소드 호출
		cp.showColorPoint();//메소드 내의 showPoint()에 의해 private로 선언된 부모필드 x,y접근

	}

}

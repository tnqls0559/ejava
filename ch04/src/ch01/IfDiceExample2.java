package ch01;

public class IfDiceExample2 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		
		System.out.println("첫 번째 주사위:"+num1);
		System.out.println("두 번째 주사위:"+num2);
		System.out.println("두 주사위의 눈의 합:"+(num1+num2));
				

	}

}

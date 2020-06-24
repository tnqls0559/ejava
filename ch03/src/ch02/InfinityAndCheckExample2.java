package ch02;

import java.util.Scanner;

public class InfinityAndCheckExample2 {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
		int x=5;
		double y;
		
		System.out.println("실수를 입력하세요:");
		y=scanner.nextDouble();
		
		double z=x%y;
		
		if(Double.isNaN(z)) {
			System.out.println("계산불가");
		}else {
			System.out.println(z+2);
		}
		
		
		

	}

}

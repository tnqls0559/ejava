package ch02;

import java.util.Scanner;

public class TryCatchExam2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("여기는 try블럭밖");
		
	 try {
		      int num = scanner.nextInt();
		      System.out.println("num:"+num);
			  System.out.println(1+2);
			  System.out.println("hello");
			  System.out.println(10.0+20);
		 } catch (Exception e) {
			
		}
	 System.out.println("여기도 try~catch블럭 밖");

	}

}

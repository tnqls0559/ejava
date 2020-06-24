package ch03;

import java.util.Scanner;
//입력값이 2의 배수 혹은 3의 배수인지 확인문제
public class CompareOperatorExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("양의 정수를 입력하세요");
		
		num=scanner.nextInt();
		
	   if(num%2==0 || num%3==0) {
		   System.out.println("2의 배수이거나 3의 배수입니다.");
	   }else {
		   System.out.println("2나3의 배수가 아닙니다.");
	   }
 }
}		


	


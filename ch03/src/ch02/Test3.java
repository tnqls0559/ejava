package ch02;

import java.util.Scanner;

public class Test3 {
	// 두 숫자를 입력받아서 더하기, 빼기, 곱하기 나누기 연산을 한 결과를 출력하도록 p/g을 작성하세 단, 나누는 값이 0 이면 예외처리를 하도록 작성하세요.(정수)
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  double num1,num2;
	  
	  System.out.println("첫 번째 숫자를 입력하세요");
	  num1 = scanner.nextDouble();
	  
	  System.out.println("두 번째 숫자를 입력하세요");
	  num2 = scanner.nextDouble();
	  
	  System.out.println((int)num1+"+"+(int)num2+"="+(int)(num1+num2));
	  System.out.println((int)num1+"-"+(int)num2+"="+(int)(num1+num2));
	  System.out.println((int)num1+"x"+(int)num2+"="+(int)(num1+num2));
	  try {
		  System.out.println((int)num1+"/"+(int)num2+"="+(num1/num2));
	  }catch(Exception e) {
		  System.out.println("0으로는 나눌 수 없습니다.");
	  }

	}

}

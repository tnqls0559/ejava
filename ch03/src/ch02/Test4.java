package ch02;

import java.util.Scanner;

public class Test4 {
	// �� ���ڸ� �Է¹޾Ƽ� ���ϱ�, ����, ���ϱ� ������ ������ �� ����� ����ϵ��� p/g�� �ۼ��ϼ� ��, ������ ���� 0 �̸� ����ó���� �ϵ��� �ۼ��ϼ���.(�Ǽ�)
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  double num1,num2;
	  
	  System.out.println("ù ��° ���ڸ� �Է��ϼ���");
	  num1 = scanner.nextDouble();
	  
	  System.out.println("�� ��° ���ڸ� �Է��ϼ���");
	  num2 = scanner.nextDouble();
	  
	  System.out.println(num1+"+"+num2+"="+(num1+num2));
	  System.out.println(num1+"-"+num2+"="+(num1+num2));
	  System.out.println(num1+"x"+num2+"="+(num1+num2));
	  try {
		  if(num2==0.0 || num2==0) {
			  throw new Exception("0.0���� ���� �� �����ϴ�.");
		  }
		  System.out.println(num1+"/"+num2+"="+(num1/num2));
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }

	}

}

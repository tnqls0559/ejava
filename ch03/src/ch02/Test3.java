package ch02;

import java.util.Scanner;

public class Test3 {
	// �� ���ڸ� �Է¹޾Ƽ� ���ϱ�, ����, ���ϱ� ������ ������ �� ����� ����ϵ��� p/g�� �ۼ��ϼ� ��, ������ ���� 0 �̸� ����ó���� �ϵ��� �ۼ��ϼ���.(����)
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  double num1,num2;
	  
	  System.out.println("ù ��° ���ڸ� �Է��ϼ���");
	  num1 = scanner.nextDouble();
	  
	  System.out.println("�� ��° ���ڸ� �Է��ϼ���");
	  num2 = scanner.nextDouble();
	  
	  System.out.println((int)num1+"+"+(int)num2+"="+(int)(num1+num2));
	  System.out.println((int)num1+"-"+(int)num2+"="+(int)(num1+num2));
	  System.out.println((int)num1+"x"+(int)num2+"="+(int)(num1+num2));
	  try {
		  System.out.println((int)num1+"/"+(int)num2+"="+(num1/num2));
	  }catch(Exception e) {
		  System.out.println("0���δ� ���� �� �����ϴ�.");
	  }

	}

}

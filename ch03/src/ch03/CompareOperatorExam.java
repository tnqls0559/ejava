package ch03;

import java.util.Scanner;
//�Է°��� 2�� ��� Ȥ�� 3�� ������� Ȯ�ι���
public class CompareOperatorExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("���� ������ �Է��ϼ���");
		
		num=scanner.nextInt();
		
	   if(num%2==0 || num%3==0) {
		   System.out.println("2�� ����̰ų� 3�� ����Դϴ�.");
	   }else {
		   System.out.println("2��3�� ����� �ƴմϴ�.");
	   }
 }
}		


	


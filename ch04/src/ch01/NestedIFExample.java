package ch01;

import java.util.Scanner;

public class NestedIFExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun=true;
		
	while(isRun) {
	    System.out.println("������ �Է��ϼ���(0~100)");
		int score = scanner.nextInt();
		
		System.out.println("�г��� �Է��ϼ���(1~4)");
		int year = scanner.nextInt();
		
		if(score>=60) {//60�� �̻� ���� 
			if(year!=4)//1,2,3�г� //4�г� �̻� ����
				System.out.println("�հ�!");
			else if(score>=70)//4�г� & 70�̻�
				System.out.println("�հ�!");
			else //4�г� & 70�̸�
				System.out.println("���հ�");
		}else {//�� ���ǿ� �ش��� ���� ������ ex)������ 60�̸�
			System.out.println("���հ�");
		}
		System.out.println("����ұ��?");
		char yesNo=scanner.next().charAt(0);
		if(yesNo=='n' || yesNo=='N') isRun=!isRun;
		
        }//while��.
		   System.out.println("���α׷� ����");
}	}



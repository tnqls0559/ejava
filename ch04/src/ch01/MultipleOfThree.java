package ch01;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int num = scanner.nextInt();
		
		if(num%3==0) {
			System.out.println("3�� ����Դϴ�.");
		}else 
			System.out.println("3�� ����� �ƴմϴ�.");
			
		System.out.println(num%3==0?"3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.");
		scanner.close();

	}

}
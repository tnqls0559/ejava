package ch02;

import java.util.Scanner;//import:�ٸ� ��Ű���� Ŭ������ ����ϴ� ��ɹ�

public class ArithmeticOperator {

	public static void main(String[] args) {
		int time = 5000;
		Scanner scanner = new Scanner(System.in);
		boolean play=true;
		
		while(play) {
		
		System.out.print("������ �Է��ϼ���:");
		
		time=scanner.nextInt(); 
		
		int second = time % 60;  //60���� ���� �������� ��
		int minute = (time / 60) % 60;//60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60;//60���� ���� ���� �ٽ� 60���� ���� ���� �ð�
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "���Դϴ�.");
		
		System.out.println("����ұ��?>");
		char yesNo=scanner.next().charAt(0);
		if(yesNo=='n' || yesNo=='N') {//���ں� ==
			play=!play;
		}

	}//while�� ��.
		System.out.println("��");
	}
}

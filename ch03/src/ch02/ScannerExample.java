package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		boolean isRun = true;
		//Scanner instance����
		// new Ŭ������([�Ű�����]);
		Scanner scanner = new Scanner(System.in);
	while(isRun){
		System.out.println("�̸��� �Է��ϼ���:");
		String name = scanner.next();//Ű���� �Է���ū�� ���ڿ��� ���
		System.out.println("������ ���ø� �Է��ϼ���:");
		String city = scanner.next();//Ű���� �Է���ū�� ���ڿ��� ���
		System.out.println("���̸� �Է��ϼ���:");
		int age = scanner.nextInt();//Ű���� �Է���ū�� int�� ���
		System.out.println("�����Ը� �Ҽ������� �Է��ϼ���:");
		double weight = scanner.nextDouble();//Ű���� ;�Է���ū�� double�� ���
		System.out.println("��ȥ���θ� true/false�� �Է��ϼ���:");
		boolean single = scanner.hasNextBoolean();//Ű���� �Է���ū�� boolean�� ���
		
		
		System.out.println("�̸�:"+name);
		System.out.println("����:"+city);
		System.out.println("����:"+age);
	    System.out.println("������:"+weight);
	    System.out.println("��ȥ����:"+single);
	    
	    System.out.println("����ұ��?:");
	    char yesNo=scanner.next().charAt(0);//�����ϳ� �ޱ�
	    if(yesNo=='n' || yesNo=='N') {
	    	isRun=false;//isRun=!isRun
	    }
		}//while�� ��.
		System.out.println("����");
	    //Scanner�ν��Ͻ� ����
	    scanner.close();
		
		
		

	}

}
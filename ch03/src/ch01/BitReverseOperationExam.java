package ch01;

public class BitReverseOperationExam {
	public static void main(String[] args) {
		int v1=10;
		int v2=~v1;//��Ʈ���� 1�Ǻ���
		int v3=~v1+1;//��Ʈ���� +1 2�Ǻ���
		System.out.println("(������:)"+v1);
		System.out.println(Integer.toBinaryString(v1));
		System.out.println("(������:)"+v2);
		System.out.println(Integer.toBinaryString(v2));
		System.out.println("(������:)"+v3);
		System.out.println(Integer.toBinaryString(v3));
				
	    int v4 = -10;
		int v5 = ~v4;//1�Ǻ���
		int v6 =~v4+1;//2�Ǻ���
		System.out.println("(������:)"+v4);
		System.out.println("(������:)"+v5);
		System.out.println("(������:)"+v6);
		
		String message="hello";
		System.out.println(message.length());		
	}
	//�޼ҵ�
	//���������� ������������� ����Ÿ�� �޼ҵ��(�ŰԺ���Ÿ�� �ŰԺ�����({���๮}
	public static String toBinaryString(int value) {
		String str = (Integer.toBinaryString(value));
		while(str.length()<32) {
			System.out.println(str);
			str="0"+str;//1010 => 01010 =>001010 => 0001010 => 00001010	
		}
		return str;//�Լ�(�޼ҵ�)���� return���� ������ �����ϰ� ȣ���Ѱ����� �̵�
			       //return ��, �̸� ���� ������.
		
		
	
		
	}

}

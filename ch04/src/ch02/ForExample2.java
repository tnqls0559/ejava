package ch02;
//for(�ʱⰪ;������;����){���๮;}
public class ForExample2 {

	public static void main(String[] args) {
		//1~100������ ������ ���� ����� ���
		int sum=0;//���� ����� ������ ���� ����, �ʱ�ȭ
		
		int i=1;
		for(;i<=100;) {
			sum=sum+i;
			i++;
		}
		System.out.println("1���� 100������ ������ ��:"+sum);

	}

}

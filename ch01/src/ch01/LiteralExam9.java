package ch01;
//Literal
public class LiteralExam9 {
	public static void main(String[] args) {
		//���ú��� booleanŸ�� ������ booleanŸ�� ���ͷ� true����(�ʱ�ȭ)
		boolean isRun=true;
		isRun=10>1;//����:���� = ������:��(���ͷ�) Ȥ�� ��������
		System.out.println("���:"+isRun);
		//����Ÿ�� ���� i ������ ����Ÿ�� ���ͷ� 10 ����
		int i=1;
		
		//while(����){���๮;}
		while(isRun) {
			System.out.println("�ɰ�"+i);
			i++;//10
			if(i==10) isRun=false;//i�� 10�϶� isRun�� false�� ����.
		}
	System.out.println("����");
	}

}

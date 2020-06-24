package ch08.ch03;

public class LambdaMainExample {
	public static void main(String[] args) {
		//����(anonymous interface)
		MyFunctionalInterface mi = new MyFunctionalInterface() {
			@Override
			public int sum(int x, int y) {
				return x+y;
			}			
		};
		
		System.out.println(mi.sum(10,20));
		
		MyFunctionalInterface mi2 = new MyClass();//promotion
		System.out.println(mi2.sum(10, 20));
		//���ٽ�
		//���ԵǴ� �������̽��� Ÿ���� �ڹٰ� �˰�����=
		//�������̽����� �߻� �޼ҵ尡 ���� �ϳ����߸� ��.
		//=������ �������̽���� �޼ҵ���� ����,
		//�Ű������� Ÿ�� ���� ������, ǥ��
		//()->{}ȭ��ǥ�� ǥ��
		//{}�ȿ� ��ɹ��� �ϳ��� {}���� ����, return���� ��������.
		MyFunctionalInterface mi3 = (x,y)->x+y;
		System.out.println(mi3.sum(10, 20));
			 
			
			
			
		

	}
}

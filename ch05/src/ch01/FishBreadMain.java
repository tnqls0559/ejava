package ch01;

public class FishBreadMain {

	public static void main(String[] args) {
		FishBread f1 = null;//main �޼ҵ� ������ ���� ������������ �ʱ�ȭ null
		System.out.println(f1==null);//��ü�� ���� ��
		f1 = new FishBread();
		
		System.out.println(f1==null);//��ü�� ���� ��		
		FishBread f2 = new FishBread();		
		
		FishBread f3 = new FishBread();
		System.out.println(f3==null);//��ü�� ���� �� false;
		f3=null;//f3�� ����Ű�� �ν��Ͻ�(��ü)���� �������谡 ������.
		System.out.println(f3==null);//��ü�� ������ ������ true

		f1.name="ù��°";
		f2.name="�ι�°";
				
		try {
		f3.name="����°";
		}catch(Exception e) {
			System.out.println("f3�� ����Ű�� �ν��Ͻ��� �����!");
		}
		 f1.method1();
		 f2.method1();
		try {
		 f3.method1();
		}catch(Exception e)  {
			System.out.println("f3�� ����Ű�� �ν��Ͻ��� ��� ȣ��Ұ�");
		}
		System.out.println("�� ������� �ؾ ����:"+FishBread.seq);
		//char c1=10;
		//char c2=10;
		//char c3=10;
		
		}
	}


package ch01;
//Ŭ���� - �Ӽ�(����) + �޼ҵ�(�Լ�)
//�ҽ��ڵ� �ۼ��� extends Object �κ��� ������
//�����Ͻ� extends Object �κ��� �߰��Ͽ� ������
//Class ���Ͽ��� �׻� extends Object �κ��� �߰���.
public class ClassExam/* extends Object*/{
	//������
	public ClassExam() {
		System.out.println("ClassExam�� defalut������");
	}
	static int num=10;//static�� ����
	public static void method1() {//static�� �޼ҵ�
		System.out.println("static�޼ҵ�");	
	}
	//main �޼ҵ�
	public static void main(String[] args) {
		//instance����
		ClassExam c=new ClassExam();//ù��° ���� �ν��Ͻ�
		//instance�� �ִ� �޼ҵ� ȣ��(����)
		c=new ClassExam();//�ι�° ���� �ν��Ͻ�
		ClassExam.method1();
		//Ŭ������ static���� ���
		System.out.println(ClassExam.num);
	}

}
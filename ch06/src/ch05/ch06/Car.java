package ch05.ch06;

public class Car {
	//�ʵ�
	String company;
	String model;
	int year;
	//������
	Car(String company){//Default������
		this.company=company;//�Ű����� String 1��¥�� ������
	}
	Car(String company,String model){//�Ű����� String,String 2��¥�� ������
		this(company);//���� �Ű����� 1��¥�� ������ ȣ��
		this.model=model;
	}
	//�Ű����� String,String,String 3��¥�� ������
	Car(String company,String model,int year){
		this(company,model);//���� �Ű����� 2��¥�� ������ ȣ��
		this.year=year;
	}
	//�Ű������� Ÿ��,����,������ �ٸ��� �ٸ� �����ڷ� �ν�
	Car(String company,int year,String model){
		this.company=company;
		this.model=model;
		this.year=year;
	}	
	Car(int year,String model,String company){
		this.company=company;
		this.model=model;
		this.year=year;
	}
	//�Ű��������� ����
	//Car(int year,String model,String company){
		//this.company=company;
		//this.model=model;
		//this.year=year;
	//}
	//�޼ҵ�
	public Car() {
		// TODO Auto-generated constructor stub
	}

}

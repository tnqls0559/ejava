package ch03.verify;
//Ŭ������ instance�� ����� ���� ���赵
public class Stock {
	//�Ӽ�
	private String item;//���������� private�� ��������
	private double qty;//���������� private�� ��������
	//�⺻ ������
	Stock(){}
	//�޼ҵ�
		public void setItem(String item) {
			this.item=item;
		}
		//��������޼ҵ�
		//�������+amount;
		public void setQty(int amount) {
			qty=amount;
		}
		public void inStock(int amount) {
			qty=qty+amount;
		}
		
		public double getQty(){

		return qty;
	}
	//���޼ҵ�
	//ĸ��ȭ�� �̿��Ͽ� �޼ҵ带 �ϼ��ϰ�
	//StockMainExamŬ��������
	//scanner�� �̿��Ͽ�, ��� ��/��� �غ�����.
	public void outQty(double amount) {
		if(qty-amount>=0) {
		   qty-=amount;

		}
	}

}

package ch03.verify;

import java.util.Scanner;

public class StockMainExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//StockŬ����(���赵)�� �´� �ν��Ͻ� ����
		//Ÿ�� ����=new Ÿ��();
		Stock stock = new Stock();
		
		//�޼ҵ� �����Ͽ� stock�ν��Ͻ��� �Ӽ��� ����
		//stock.item="apple"ó�� ����������X
		System.out.println("��ǰ���� �Է��ϼ���>");
		String item = scanner.next();
		stock.setItem(item);
		System.out.println("��ǰ ������ �Է��ϼ���>");
		int amount = scanner.nextInt();
		stock.setQty(amount);
		
		double qty=stock.getQty();
		//qty=stock.qty; X
		System.out.println("�����:"+qty);
		
		System.out.println("��� ������ �Է��ϼ���>");
		amount = scanner.nextInt();
		stock.outQty(amount);
		qty=stock.getQty();
		System.out.println("�����:"+qty);

	}

}

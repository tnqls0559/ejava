package ch10.verify;
import java.sql.Time;
import java.util.Scanner;

public class Parking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//CarŸ�� �迭����
		Car[] cars=new Car[3];
		//Car Ÿ�� �迭�� Car ��ü ���� �� ����
		for(int i=0;i<cars.length;i++) {
			System.out.println("����>");
		String kind=scanner.next();
		System.out.println("�����ð�(����):");
		int inTime = scanner.nextInt();
		cars[i]=new Car(kind,inTime);
		}
		/*cars[0]=new Car("Sedan",8);
		cars[1]=new Car("uv",13);
		cars[2]=new Car("Truck",14);
		*/
		//�����ð� ���
		for(int i=0;i<cars.length;i++) {
			System.out.println("�����ð�(����):");
			int outTime = scanner.nextInt();
			cars[i].setOutTime(outTime);
		}
		/*cars[0].setOutTime(24);
		cars[1].setOutTime(18);
		cars[2].setOutTime(17);
		*/
		//������ ������ ���
		for(int i=0;i<cars.length;i++) {
			Car c = cars[i];
			calc(c);//������ ��� �޼ҵ� caclc()ȣ��
		}
	
	}
	//sedan:�ð��� 3000��, suv:�ð��� 5000��, Truck:�ð��� 7000��
			//12�ð��ʰ��� �ϰ� 50000�� ¡��
			//�����ð��� �����ð��� �Է��Ͽ� ���.
	//
	static void calc(Car car) {
		int term=car.getOutTime()-car.inTime;
		double fee=0;
		if(term>12) fee=50000;//�����ð��� 12�ð� �ʰ��� �ϰ�¡��
		else if(car.kind.equals("Sedan")) {
			fee = 3000*term;
		}else if(car.kind.equals("Suv")) {
			fee = 5000*term;
		}else if(car.kind.equals("Truck")) {
			fee = 7000*term;
		}
		System.out.println("�����ð�:"+car.inTime+",�����ð�:"
		         +car.getOutTime()+",������:"+fee);
	}
	
}

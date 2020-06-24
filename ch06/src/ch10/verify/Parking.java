package ch10.verify;
import java.sql.Time;
import java.util.Scanner;

public class Parking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Car타입 배열생성
		Car[] cars=new Car[3];
		//Car 타입 배열에 Car 객체 생성 및 저장
		for(int i=0;i<cars.length;i++) {
			System.out.println("차종>");
		String kind=scanner.next();
		System.out.println("입차시각(숫자):");
		int inTime = scanner.nextInt();
		cars[i]=new Car(kind,inTime);
		}
		/*cars[0]=new Car("Sedan",8);
		cars[1]=new Car("uv",13);
		cars[2]=new Car("Truck",14);
		*/
		//출차시간 등록
		for(int i=0;i<cars.length;i++) {
			System.out.println("출차시각(숫자):");
			int outTime = scanner.nextInt();
			cars[i].setOutTime(outTime);
		}
		/*cars[0].setOutTime(24);
		cars[1].setOutTime(18);
		cars[2].setOutTime(17);
		*/
		//차량별 주차비 출력
		for(int i=0;i<cars.length;i++) {
			Car c = cars[i];
			calc(c);//주차비 계산 메소드 caclc()호출
		}
	
	}
	//sedan:시간당 3000원, suv:시간당 5000원, Truck:시간당 7000원
			//12시간초과시 일괄 50000원 징수
			//입차시간과 출차시간을 입력하여 계산.
	//
	static void calc(Car car) {
		int term=car.getOutTime()-car.inTime;
		double fee=0;
		if(term>12) fee=50000;//주차시간이 12시간 초과시 일괄징수
		else if(car.kind.equals("Sedan")) {
			fee = 3000*term;
		}else if(car.kind.equals("Suv")) {
			fee = 5000*term;
		}else if(car.kind.equals("Truck")) {
			fee = 7000*term;
		}
		System.out.println("입차시각:"+car.inTime+",출차시각:"
		         +car.getOutTime()+",주차비:"+fee);
	}
	
}

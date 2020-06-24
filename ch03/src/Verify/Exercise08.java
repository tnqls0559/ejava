package Verify;

public class Exercise08 {

	public static void main(String[] args) {
		double x=5.0;
		double y=0.0;
		
		double z=x%y;
		
		if(Double.isNaN(z)) {//Wrapper클래스 기본타입 double을 클래스화 한 것
			System.out.println("0.0으로는 나눌 수 없습니다.");
		}else {
			double result = z+10;
		    System.out.println("결과:"+result);
}		
}
	

}

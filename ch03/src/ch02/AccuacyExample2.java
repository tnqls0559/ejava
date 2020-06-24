package ch02;
//정확한 계산시 부동소수점 타입 사용하지 않음
public class AccuacyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		
		
		int totalpieces = apple*10;
		int number=7;
		int temp = totalpieces - number;
		double result = temp/10.0;
		
		System.out.println("사과 한개에서 0.7 조각을 빼면,");
		System.out.println(result+"조각이 남는다");
		

	}

}

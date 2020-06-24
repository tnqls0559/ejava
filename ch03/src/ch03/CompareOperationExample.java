package ch03;
//비교연산자: 두 피 연산자 비교 결과는 true/false
public class CompareOperationExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1==num2);//같은지 비교
		System.out.println(num1!=num2);//다른지 비교
		System.out.println(num1<=num2);//num1이num1보다 작거나 같은지 비교
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result = char1<char2;//65 < 66
		System.out.println("result="+result);
		
		
		int age=25;
		//System.out.println(20<=age<30); 오류
		System.out.println((20<=age) & (age<30));

	}

}

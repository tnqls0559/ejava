package ch02;


public class TryCatchExam5 {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		   
		  int result;
		
		
		try {
			result =num1/num2;
		}catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		
		}

		

	}

}

package ch03;
//삼항연산: 피연산자의 수가 3개인 연산
public class ConditionalOperationExample1 {

	public static void main(String[] args) {
		int score = 75;
		char grade;
		if(score>90) {
			grade='A';
		}else if(score>80) {
			grade='B';
		}else if(score>70) {
			grade='C';
		}else {
			grade='F';
		}
		System.out.println(grade);
		
		//삼항연산식
		grade = score>90?'A' :score>80?'B' :score>70?'C':'F';
		System.out.println(grade);

	}

}

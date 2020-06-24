package ch01;
//Literal
public class LiteralExam9 {
	public static void main(String[] args) {
		//로컬변수 boolean타입 선언후 boolean타입 리터럴 true대입(초기화)
		boolean isRun=true;
		isRun=10>1;//왼쪽:변수 = 오른쪽:값(리터럴) 혹은 연산결과값
		System.out.println("결과:"+isRun);
		//정수타입 변수 i 선언후 정수타입 리터럴 10 대입
		int i=1;
		
		//while(조건){실행문;}
		while(isRun) {
			System.out.println("곃과"+i);
			i++;//10
			if(i==10) isRun=false;//i가 10일때 isRun은 false로 변함.
		}
	System.out.println("종료");
	}

}

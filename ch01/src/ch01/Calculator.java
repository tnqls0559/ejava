package ch01;//패키지명 소스파일 위치 선언

public class Calculator {//클래스 선언부 
     //자바는 타입이 엄격함.
	public static void main(String[] args) {//main 메소드 선언부 \
		//특정 클래스 내에 포함된 함수=매소드
		int x=2;//정수형 변수 x를 선언하고 정수리터럴 2를 대입;
		int y=3;//정수형 변수 y를 선언하고 정수기터럴 3을 대입;	
        int result = x+y;//정수형변수 x에 저장된 값과 정수형변수 y에 저장된 값을 더한 결과를 정수형변수 result에 저장
        final int z=5;//정수형 상수 z를 선언하고 초기값 정수5를 대입;
        System.out.println("결과: " + result); //"결과:"문자열과 result에 저장된 값을 결합한 결과를 출력
        System.out.println("1+2"+"3");
        int z1 = 10;//상수형변수에는 초기화 이후 값을 대입 불가;
        System.out.println("z="+z1);
        x = 10; y = 20;
        result=x+y;
        System.out.println("x+y="+result);
  }
}
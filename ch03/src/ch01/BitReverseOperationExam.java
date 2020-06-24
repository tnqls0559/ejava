package ch01;

public class BitReverseOperationExam {
	public static void main(String[] args) {
		int v1=10;
		int v2=~v1;//비트반전 1의보수
		int v3=~v1+1;//비트반전 +1 2의보수
		System.out.println("(십진수:)"+v1);
		System.out.println(Integer.toBinaryString(v1));
		System.out.println("(십진수:)"+v2);
		System.out.println(Integer.toBinaryString(v2));
		System.out.println("(십진수:)"+v3);
		System.out.println(Integer.toBinaryString(v3));
				
	    int v4 = -10;
		int v5 = ~v4;//1의보수
		int v6 =~v4+1;//2의보수
		System.out.println("(십진수:)"+v4);
		System.out.println("(십진수:)"+v5);
		System.out.println("(십진수:)"+v6);
		
		String message="hello";
		System.out.println(message.length());		
	}
	//메소드
	//접근지정자 생성장소지정자 리턴타입 메소드명(매게변수타입 매게변수명({실행문}
	public static String toBinaryString(int value) {
		String str = (Integer.toBinaryString(value));
		while(str.length()<32) {
			System.out.println(str);
			str="0"+str;//1010 => 01010 =>001010 => 0001010 => 00001010	
		}
		return str;//함수(메소드)에서 return문을 만나면 종료하고 호출한곳으로 이동
			       //return 값, 이면 값을 리턴함.
		
		
	
		
	}

}

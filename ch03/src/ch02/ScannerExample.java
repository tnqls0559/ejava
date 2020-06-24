package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		boolean isRun = true;
		//Scanner instance생성
		// new 클래스명([매개변수]);
		Scanner scanner = new Scanner(System.in);
	while(isRun){
		System.out.println("이름을 입력하세요:");
		String name = scanner.next();//키보드 입력토큰을 문자열로 출력
		System.out.println("거주지 도시를 입력하세요:");
		String city = scanner.next();//키보드 입력토큰을 문자열로 출력
		System.out.println("나이를 입력하세요:");
		int age = scanner.nextInt();//키보드 입력토큰을 int로 출력
		System.out.println("몸무게를 소수점으로 입력하세요:");
		double weight = scanner.nextDouble();//키보드 ;입력토큰을 double로 출력
		System.out.println("미혼여부를 true/false로 입력하세요:");
		boolean single = scanner.hasNextBoolean();//키보드 입력토큰을 boolean로 출력
		
		
		System.out.println("이름:"+name);
		System.out.println("도시:"+city);
		System.out.println("나이:"+age);
	    System.out.println("몸무게:"+weight);
	    System.out.println("미혼여부:"+single);
	    
	    System.out.println("계속할까요?:");
	    char yesNo=scanner.next().charAt(0);//문자하나 받기
	    if(yesNo=='n' || yesNo=='N') {
	    	isRun=false;//isRun=!isRun
	    }
		}//while문 끝.
		System.out.println("종료");
	    //Scanner인스턴스 제거
	    scanner.close();
		
		
		

	}

}

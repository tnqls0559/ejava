package ch02;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		String str;
		//Scanner 인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요:");
		// 한 줄 입력 받기
		str = scanner.nextLine();
		
		//한줄의 문자열을 구분다('  ')를 기준으로 잘라서 문자열 배열로 만듬 -split("  ")
		//["kim"]["seoul"]["20"]["65.1"]["true"]
		String[] infos =str.split("  ");
		
		for(int i=0;i<infos.length;i++) {
			System.out.println(infos[i]);
		}
		
		
		//Scanner자원해제
		scanner.close();

	}

}

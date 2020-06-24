package ch02;
import java.util.Scanner;
//구구단
public class WhileExample1 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
	while(true){// 무한 loop
		System.out.println("출력 할 단의 수를 입력하세요:");
		num=scanner.nextInt();

		for(int i=1;i<=9;i++) {
			System.out.print(num+"x"+i+"="+(num*i)+"\t");
		}
		System.out.println();//한 줄 아래로
		System.out.println("계속할까요?");
		char yesNo=scanner.next().charAt(0);
		if(yesNo=='n' || yesNo=='N') break;
	  }
	  System.out.println("프로그램 종료");
}
	}



package ch02;
import java.util.Scanner;
//정수개수,평균 구하기
public class whileExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	 while(true)	{
		int count=0;
		int sum=0;
		
		System.out.println("정수를 입력하세요. 마지막에 -1을 입력하세요");
		
		int n=scanner.nextInt();
		while(n!=-1) {
			sum+=n;//sum=sum+n;
			count++;//입력된 값의 갯수 카운트 변수
			n=scanner.nextInt();//값 입력
		}
		if(count==0)System.out.println("입력된 수가 없습니다.");
		else {
			System.out.println("정수의 개수는"+count+"개임");
			System.out.println("평균은"+(double)sum/count+"임");
		}	
		System.out.println("계속할까요?>");
		char yesNo=scanner.next().charAt(0);
		 if(yesNo=='n' || yesNo=='N') break;
		
	}//while문 끝.
		System.out.println("프로그램 종료");
		scanner.close();
}}

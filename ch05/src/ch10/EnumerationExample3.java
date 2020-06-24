package ch10;
import java.util.Scanner;
public class EnumerationExample3 {

	public static void main(String[] args) {
		LoginResult result=null;
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		while(true) {
		System.out.println("아이디를 입력하세요:");
		String id=scanner.next();
		System.out.println("비번을 입력하세요:");
		String pwd=scanner.next();
		
		if(id.equals("hong") & pwd.equals("1234"))
			result=LoginResult.LOGIN_SUCCESS;
		else {
			result=LoginResult.LOGIN_FAILED;
			count++;
			if(count==3) {
				System.out.println("3회 잘못입력하였습니다. 종료합니다.");
				break;
			}
		}		
		System.out.println("결과:"+result);
		
		}//while문 끝.
		System.out.println("프로그램 종료");
			

	}

}

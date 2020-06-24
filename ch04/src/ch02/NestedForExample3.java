package ch02;
import java.util.Scanner;
//구구단 세로
public class NestedForExample3 {

	public static void main(String[] args) {
		
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력을 시작할 단 수 입력");
		int startNum=scanner.nextInt();
		System.out.println("출력을 종료할 단 수 입력");
		int stopNum=scanner.nextInt();
		
		for(int i=1;i<=9;i++) {
			for(int j=startNum;j<=stopNum;j++) {
				System.out.print(j+"x"+i+"="+(i*j)+"\t");//i,j자리 바꾸면 구구단 가로				
			}
			System.out.println();
		}
		System.out.println("계속할까요?");
		String yesNo=scanner.next();
		if("n".equals(yesNo) || "N".equals(yesNo)) {//yesNo.equals("n")
			break;
		}
		}while(true);
		System.out.println("프로그램 종료");
	}

}

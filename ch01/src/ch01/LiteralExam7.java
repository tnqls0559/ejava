package ch01;
//리터럴 - 특수 용도의 문자(escape문자)
// \로 시작
public class LiteralExam7 {
	public static void main(String[] args) {
	System.out.println("hello \t 여러분");//한탭 만큼 공백 띄우기
	System.out.println("\n 반갑습니다\n");//한줄 아래로 내리기
	System.out.println("\'홍길동\'님!!!");//홑따옴표 인용부호
    System.out.println("\"일지매\"도 반감습니다.");//쌍따옴표 인용부호
    System.out.println("c:\\worspace\\ch01\\LiteralExam7.java");//디렉토리 경로 지정
    System.out.println("\uac00");//unicode입력
    
	}
}

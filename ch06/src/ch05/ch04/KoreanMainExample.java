package ch05.ch04;

public class KoreanMainExample {
	public static void main(String[] args) {
		
		//Korean k = new Korean();//default 생성자로는 생성불가
		Korean korean1 = new Korean("홍길동","011225-1234567");
		Korean korean2 = new Korean("일지매","930525-0654321");
		
		korean1.getInfo();
		korean2.getInfo();

	}

}

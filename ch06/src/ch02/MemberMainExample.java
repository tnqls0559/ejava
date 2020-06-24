package ch02;

public class MemberMainExample {

	public static void main(String[] args) {
		Member member = new Member();
		member.name="홍길동";//속성public 접근지정자
		member.id="hong";//속성public 접근지정자
		//member.pwd="1234";//속성private 접근지정자
		//기능-메소드
		member.getInfo("ADMIN");//메소드 public 접근지정자(제한자)
		//member.getPwd();//메소드 private 접근지정자(제한자)

	}

}

package ch02;

public class Member {
	//외부노출가능 속성-public 접근제한자
	public String name;
	public String id;
	//외부노출불가 속성 - private 접근제한자
	private String pwd="1234";
	
	//this-클래스에 의해 생성된 instance를 가르키는 예약어
    public void setPwd(String pwd) {
    	this.pwd=pwd;
    }
	
	//외부에 노출가능 메소드-public 접근제한자
	void getInfo(String grant) {
		if(Grant.valueOf(grant)==Grant.ADMIN) {
			System.out.println("비번은:"+getPwd());
		}else {
			System.out.println(Grant.ADMIN.name()+"이 아니면 확인불가");
		}
	}
	//외부에 노출불가 메소드 - private 접근제한자
	private String getPwd() {
		return this.pwd;
	}

}

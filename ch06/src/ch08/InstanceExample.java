package ch08;

public class InstanceExample {
	//non-static멤버(인스턴스 멤버)는 객체 생성없이는 사용불가
	int field1;
	//field2는 로드되어서 생성되어있지만, field는 인스천스 멤버이므로 생성되어 있지않음.
	//field2가 field1을 사용불가
	//static int field2=field1+10;
	//로드된 field2의 초기값은 0
	//int field3=field2+10;
	
	public static void main(String[] args) {
	}
}

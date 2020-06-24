package ch02;

public class VariableScope1 {
	public static void main(String[] args) {
		int var1;//main메소드내에서 선언된 로컬변수
		
		if(true) {
			int var2;
			var1=10;//main메소드내의 if블럭에서 사용가능
			var2=20;
			System.out.println("var1="+var1);
			System.out.println("var2="+var2);
			//System.out.println("var3="+var3); 다른 블럭내에 사용불가
	}
	
		for(int i=0;i<10;i++) {
			int var3;
			var3=i;//정수변수var3에 정수변수i의 값을 대입
			var1=20;//main메소드내의 for블럭에서 사용가능
			System.out.println("var3="+var3);
			System.out.println("var1="+var1);
			//System.out.println("var2="+var2); 다른 블럭내에 변수사용불가
}
		System.out.println("var1="+var1);//main메소드내에서 사용가능
		//System.out.println("var2="+var2);//하위블럭에서 선언된 변수는 상위블럭에서 사용불가
		//System.out.println("var3="+var3);//하위블럭에서 선언된 변수는 상위블럭에서 사용불가
}
}
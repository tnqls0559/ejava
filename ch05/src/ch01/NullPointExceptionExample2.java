package ch01;

public class NullPointExceptionExample2 {

	public static void main(String[] args) {
		//객체선언
		String str=null;
		str="hello";//문자열 리터럴로 생성하면 new String() 처럼 생성됨.
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		
		str="hello";//문자열 리터럴로 생성하면 new String() 처럼 생성됨.
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));				
		
		str=new String("hello");
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		str=new String("hello");
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		
		String str1=new String("hello");
		System.out.println(str.hashCode());//객체 저장된 hash코드값
		System.out.println(System.identityHashCode(str));//객체의 저장된 물리공간의 주소값
		
		//str변수와 str1 참조변수가 가르키는 객체가 동일한가?false
		System.out.println(str==str1);
		//str변수가 가르키는 객체의 내용과 str1변수가 가르키는 객체의 내용이 같은가?true
		System.out.println(str.equals(str1));
		
		System.out.println("총문자수:"+str.length());

	}

}

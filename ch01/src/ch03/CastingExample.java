package ch03;
//casting(강제형변환)
public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		//유니코드값에 해당하는 문자값 
        for(int i=0;i<10;i++) {
		System.out.println((char)intValue);
		intValue++;
		}
		
		
		long longValue = 500;
		intValue = (int)longValue;//long => int
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;//double => int
		System.out.println(intValue);
		
	

	}

}

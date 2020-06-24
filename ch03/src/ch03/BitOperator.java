package ch03;

public class BitOperator {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		//비트논리연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n",(short)(a&b));//비트 AND
		System.out.printf("%04x\n",(short)(a|b));//비트 OR
		System.out.printf("%04x\n",(short)(a^b));//비트 XOR
		System.out.printf("%04x\n",(short)(~a));//비트 not
		System.out.println(toBinaryString((short)(~a)));
       }
	
	public static String toBinaryString(short a) {
		String str=Integer.toBinaryString(a);
		while(str.length()<16) {
			str="0"+str;
		}
		return str;
		
	}
	

}

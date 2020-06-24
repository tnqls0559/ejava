package ch03;
//Long타입
public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 100000000000; //초기값 범위초과
		long var4 = 10000000000L;
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

}

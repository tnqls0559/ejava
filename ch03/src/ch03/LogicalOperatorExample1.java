package ch03;

public class LogicalOperatorExample1 {

	public static void main(String[] args) {
		System.out.println(!true);
		// ^ 같으면 false다르면 true
		System.out.println(true^true);//false
		System.out.println(true^false);//true
		System.out.println(false^true);//true
		System.out.println(false^false);//false
		
		// |, || 한쪽이 true이면 다른 쪽 상관없이 결과는 true
		System.out.println(true|true);
		System.out.println(true|false);
		System.out.println(false|true);
		System.out.println(false|false);
		
		// &, && 한쪽이 false이면 다른 쪽 상관없이 결과는 늘 false
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&true);
		System.out.println(false&false);
		

	}

}

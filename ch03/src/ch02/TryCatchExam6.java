package ch02;

public class TryCatchExam6 {

	public static void main(String[] args) {
		m1();

	}
	
    public static void m1() {
    	m2();
    }
    public static void m2() {
     try {
    	m3();
    	throw new Exception("m2예외");
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }
    }//m2 끝.
    public static void m3() {
    	try {
    	throw new Exception("m3예외");
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }
}
}
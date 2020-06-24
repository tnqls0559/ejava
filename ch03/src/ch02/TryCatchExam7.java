package ch02;

public class TryCatchExam7 {

	public static void main(String[] args) {
		try {
		  m1();//m1호출
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	}
	
    public static void m1() throws Exception {
    	m2();//m2호출
    }
    public static void m2() throws Exception {
       m3();
    }
    public static void m3() throws Exception {
    	throw new Exception("m3예외");
    	   
}
}
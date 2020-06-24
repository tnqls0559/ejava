package ch14.ch01;

public class Service {
	@PrintAnnotation//둘 다 default, value = "-",number = 15
    public void method1() {
	    System.out.println("실행내용1");
    }
	@PrintAnnotation("*")//value = "*",number = 15
    public void method2() {
    	System.out.println("실행내용2");
    }
	@PrintAnnotation(value="#")
    public void method3() {
    	System.out.println("실행내용3");
    }


}

package ch14.ch01;

public class Service {
	@PrintAnnotation//�� �� default, value = "-",number = 15
    public void method1() {
	    System.out.println("���೻��1");
    }
	@PrintAnnotation("*")//value = "*",number = 15
    public void method2() {
    	System.out.println("���೻��2");
    }
	@PrintAnnotation(value="#")
    public void method3() {
    	System.out.println("���೻��3");
    }


}

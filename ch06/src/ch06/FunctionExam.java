package ch06;

public class FunctionExam {
    double x,y;
	//두 개의 실수(double)을 받아서 최대값을 리턴하는 메소드
	double method1(double x,double y){
		double result;
		
		if(x>y)result=x;
		else result=y;
		
		return result;
	}
	//두 개의 실수(double)을 받아서 최대값을 리턴하지않고 출력하는 메소드
	void method2(double x,double y){
		System.out.println(x>y?x:y);
	}
	//두 실수 x,y 중 최대값을 리턴하는 메소드
	double method3(){
		return x>y?x:y;
	}
	//두 실수 x,y 중 최대값을 리턴하지않고 출력하는 메소드
	void method4(){
		System.out.println(x-y>0?x:y);
	}
	
}

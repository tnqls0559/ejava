package ch01;

public class Calculator {
	//계산 결과를 저장하는 속성(field)
	static int result;
	//계산기능
	static int add(int num1,int num2) {
		result = num1+num2;
		return result;
	}
	

}

package verify;

import java.util.Scanner;

//사용자로부터 키를 입력받아서  표준체중을 계산한 후 사용자의
//체중과 비교하여 저체중인지, 표준인지, 과체중인지 출력하시요.
//표준체중=(키 -100 ) *0.9
public class Exam0427_2 {
	public static void main(String[] args) {
		double weight,stWeight,height;
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		weight = scanner.nextDouble();
		stWeight = (height-100)*0.9;//표준체중
		if(weight < stWeight) System.out.println("저체중입니다.");
		else if(weight==stWeight)System.out.println("표준체중입니다.");
		else System.out.println("과체중입니다.");

	}

}

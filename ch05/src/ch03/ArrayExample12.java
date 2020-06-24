package ch03;
//초기값 목록으로 배열생성
public class ArrayExample12 {
	public static void main(String[] args) {
		//double타입배열선언
		//double 배열선언과 동시에 double타입 값 목록으로 초기화
		double[] doubleArray = {1.0,2.0,3.0,4.0,5.0};
		
		for(int i=0;i<doubleArray.length;i++)
			System.out.println(doubleArray[i]);
		
		//double 배열선언 후 double타입 값 목록으로 초기화
		doubleArray = new double[] {6,7,8,9,10};
		//각 요소 출력
		for(int i=0;i<doubleArray.length;i++)
			System.out.println(doubleArray[i]);

	}

}

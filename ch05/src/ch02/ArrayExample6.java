package ch02;

public class ArrayExample6 {

	public static void main(String[] args) {
		//생선된 배열은 각 요소들이 비어있음, double 타입의 기본값 0.0
		double[] doubleArray = new double[5];
		for(int i=0;i<doubleArray.length;i++)
			System.out.println(doubleArray[i]);
		//배열의 각 요소접근은 index 번호로 접근
		doubleArray[0]=10.0; doubleArray[1]=20.0;
		doubleArray[2]=30.0;
		//배열의 각 요소값 출력
		for(int i=0;i<doubleArray.length;i++)
			System.out.println(doubleArray[i]);
		//double의 기본값이 저장된 요소에 접근
		double result = doubleArray[3]+5;
		System.out.println("result:"+result);

	}

}

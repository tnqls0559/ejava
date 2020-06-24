package ch02;

public class ArrayExample5 {

	public static void main(String[] args) {
		//생선된 배열은 각 요소들이 비어있음, int 타입의 기본값 0
		int[] intArray = new int[5];
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
		//배열의 각 요소접근은 index 번호로 접근
		intArray[0]=10; intArray[1]=20;
		intArray[2]=30;
		//배열의 각 요소값 출력
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
		//int타입의 기본값이 저장된 요소 접근
		int result=intArray[3]+5;//[3]이 0
		System.out.println("result:"+result);

	}

}

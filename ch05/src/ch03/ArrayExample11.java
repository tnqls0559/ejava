package ch03;
//초기값 목록으로 배열생성
public class ArrayExample11 {
	public static void main(String[] args) {
		//int타입배열선언
		//int 배열선언과 동시에 int타입 값 목록으로 초기화
		int[] intArray = {1,2,3,4,5};
		
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
		
		//int 배열선언 후 int타입 값 목록으로 초기화
		intArray = new int[] {6,7,8,9,10};
		//각 요소 출력
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
;
	}

}

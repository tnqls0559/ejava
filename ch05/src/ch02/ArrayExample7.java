package ch02;

public class ArrayExample7 {

	public static void main(String[] args) {
		//생선된 배열은 각 요소들이 비어있음, boolean 타입의 기본값 false
		boolean[] booleanArray = new boolean[5];
		for(int i=0;i<booleanArray.length;i++)
			System.out.println(booleanArray[i]);
		//배열의 각 요소접근은 index 번호로 접근
		booleanArray[0]=false; booleanArray[1]=true;
		//boolean booeanVar = 10>1;
		booleanArray[2]=10>1;
		//배열의 각 요소값 출력
		for(int i=0;i<booleanArray.length;i++)
			System.out.println(booleanArray[i]);
		//boolean타입의 기본값 false가 들어있는 요소에 접근
		boolean result = booleanArray[3] & true;
		System.out.println("result:"+result);

	}

}

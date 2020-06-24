package ch03;
//초기값 목록으로 배열생성
public class ArrayExample13 {
	public static void main(String[] args) {
		//String타입배열선언
		//String 배열선언과 동시에 String타입 값 목록으로 초기화
		String[] stringArray = {"hello","hi","bye","oh",new String("hi")};
		
		for(int i=0;i<stringArray.length;i++)
			System.out.println(stringArray[i]);
		
		//String 배열선언 후 String타입 값 목록으로 초기화
		stringArray = new String[] {"hey","bye","hello",new String("yes")};
		//각 요소 출력
		for(int i=0;i<stringArray.length;i++)
			System.out.println(stringArray[i]);

	}

}

package ch02;

public class ArrayExample8 {

	public static void main(String[] args) {
		//생선된 배열은 각 요소들이 비어있음, String 타입의 기본값 null
		String[] stringArray = new String[5];
		for(int i=0;i<stringArray.length;i++)
			System.out.println(stringArray[i]);
		//배열의 각 요소접근은 index 번호로 접근
		stringArray[0]="hello"; stringArray[1]="hi";
		//boolean booeanVar = 10>1;
		stringArray[2]= new String("hello");
		//배열의 각 요소값 출력
		for(int i=0;i<stringArray.length;i++)
			System.out.println(stringArray[i]);
		
		//참조변수가 대입되는 index번호에 null값을 주면 객체의 참조가 끊어짐.
		stringArray[0]=null;
		for(int i=0;i<stringArray.length;i++)
			System.out.println(stringArray[i]);
		//참조타입의 기본값인 null이 저장된 요소에 접근
		String result = stringArray[3]+"홍길동";
		System.out.println("result:"+result);
		//오류발생
		//참조타입이 저장된 요소의 값이 null이므로 참조객체가 없음.
		//System.out.println("length:"+stringArray[3].length());
		//참조타입이 저장된 요소의 값이 null이므로 참조객체가 없음.-비교불가
		//System.out.println("result:"+stringArray[3].equals("홍길동"));
		

	}

}

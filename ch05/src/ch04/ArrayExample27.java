package ch04;
//String 타입의 데이터를 저장할 수 있는 길이가 5인 배열을 만들고
//배열의 index 번호가 짝수번째인(index번호가 0,2,4) 요소에 값을 "hello", "hi","hey"를
//입력하고 내용을 출력하세요.
public class ArrayExample27 {

	public static void main(String[] args) {
		//String[] stringArray = new String [5];
		//System.out.println(stringArray[0]);
		//stringArray[0]="hello";
		//stringArray[2]=new String("hi");
		//String str="hey";
		//stringArray[4]=str;
		String[] stringArray = {"hello",null,"hi",null,"hey"};
		
		//int i=0;
		for(int i=0;i<stringArray.length;i+=2) {
			System.out.println(stringArray[i]);
		}
		//System.out.println(stringArray[i]);
		//System.out.println(stringArray[i+=2]);
		//System.out.println(stringArray[i+=2]);
		
		}
		

	}



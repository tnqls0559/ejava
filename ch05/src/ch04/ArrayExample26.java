package ch04;
//int 타입의 값 5개를 저장하는 배열을 만들고
//10 20 30 40 50 을 저장 후
//저장된 내용을 출력하는 코드를 작성하시오.
public class ArrayExample26 {

	public static void main(String[] args) {
		int[] intArr = {10,20,30,40,50};//생성과 동시에 배열 길이가 정해짐
		//int[] intArr = new int[5];
		//intArr[0]=10;
		//intArr[1]=20;
		//intArr[2]=30;
		//intArr[3]=40;
		//intArr[4]=50;
		
		//int i=0;
		for(int i=0;i<intArr.length;i++) {
		System.out.println(intArr[i]);
		}
		//System.out.println(intArr[i++]);
		//System.out.println(intArr[i++]);
		//System.out.println(intArr[i++]);
		//System.out.println(intArr[i++]);
		
	
		
		

	}

}

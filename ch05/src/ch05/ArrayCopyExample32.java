package ch05;
//깊은 복사(deep copy)
public class ArrayCopyExample32 {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		//새로운 배열객체를 생성하여 각 요소들의 값을 복사
		int[] arr2=new int[arr1.length];
		
		//arr2[0]=arr1[0];
		//arr2[1]=arr1[1];
		//arr2[2]=arr1[2];
		//arr2[3]=arr1[3];
		//arr2[4]=arr1[4];
		for(int i=0;i<arr1.length;i++)
			arr2[i]=arr1[i];
		
		//배열값 변경전
		System.out.println("arr2:\t");
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]+"\t");
		System.out.println();
		System.out.println("arr1:\t");
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]+"\t");
		
		arr2[2]=99;
		//배열값 변경후
		System.out.println();
		System.out.println("arr1:\t");
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]+"\t");
		
		System.out.println();
		System.out.println("arr2:\t");
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr2[i]+"\t");

	}

}

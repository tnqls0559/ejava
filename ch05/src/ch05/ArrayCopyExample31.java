package ch05;
//얕은 복사(swallow copy)
public class ArrayCopyExample31 {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		//arr1이 참조하는 배열객체의 번지를 넘김
		int[] arr2=arr1;
		
		//배열값 변경전
		System.out.println("arr2:\t");
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]+"\t");
		System.out.println("arr1:\t");
		System.out.println();
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
			System.out.println(arr1[i]+"\t");

	}

}

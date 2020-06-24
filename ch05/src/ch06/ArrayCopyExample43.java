package ch06;
//±Ì¿∫∫πªÁ
public class ArrayCopyExample43 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = new int[arr1.length];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+"\t");
		System.out.println();
		
		int[] arr3=new int[arr1.length];
		System.arraycopy(arr1, 1, arr3, 2, arr1.length-2);
		System.out.print("arr3 : ");
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+"\t");
		
	}

}

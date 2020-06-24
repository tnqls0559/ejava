package ch09;

public class ArrayExample71 {

	public static void main(String[] args) {
		String title = "성적표";
		String[] head = {"이름","국어","영어","수학","총점","평균"};
		System.out.println(title+"\t");
		
		int k=0;
		while(k<head.length) {
			System.out.print(head[k]+"\t");
			k++;
		}
		k=0;
		System.out.println("\n===================================================");
		do {
			System.out.print(head[k]+"\t");
			k++;
		}while(k<head.length);
		System.out.println("\n===================================================");
		
         for(int i=0;i<head.length;i++) {
        System.out.println("\n====================================================");
        
        for(String h:head) {
        	System.out.print(h+"\t");
        }
        System.out.println("\n=====================================================");
         }
	}

}

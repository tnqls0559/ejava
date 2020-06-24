package ch09;

public class ArrayExample72 {

	public static void main(String[] args) {
		String title = "성적표";
		String[] head = {"이름","국어","영어","수학","총점","평균"};
		System.out.println(title+"\t");
		
		String[] name = {"씨스타","엑소","투피엠","미스A"};
		
		String[] head1 = {"합계"};
		int sum=0;
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,65,87}};
		
		  for(String h:head) {
	        	System.out.print(h+"\t");
	        }
	        System.out.println("\n=====================================================");
		
		for(int i=0;i<score.length;i++) {
			   System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j];
			}
			System.out.println(sum+"\t"+(int)sum/score[i].length);
			sum=0;		
		}  
		 System.out.println("\n=====================================================");
		 
		 for(int i=3;i<score.length;i++) {
		  for(String h1:head1) {
	        	System.out.print(h1+"\t");
	}
		 }

}}
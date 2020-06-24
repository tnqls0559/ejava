package ch09;

public class ArrayExample73 {

	public static void main(String[] args) {
		String title = "성적표";
		String[] head = {"이름","국어","영어","수학","총점","평균"};
		System.out.println(title+"\t");	
		String[] name = {"씨스타","엑소","투피엠","미스A"};	
		int sum=0;
		int[] tot = new int[3];//각 과목별 합계를 저장할 배열
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
				tot[j]+=score[i][j];
			}
			System.out.println(sum+"\t"+(int)sum/score[i].length);
			sum=0;		
		}  
		 System.out.println("\n=====================================================");		 
		 System.out.print("합계\t");
		 for(int i=0;i<tot.length;i++) {
			 System.out.print(tot[i]+"\t");
		 sum+=tot[i];
		 }
		 System.out.print(sum+"\t");
		 System.out.print((double)sum/(score.length*score[0].length));
		 System.out.println();
		 }//main끝.

}
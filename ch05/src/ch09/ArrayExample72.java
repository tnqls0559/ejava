package ch09;

public class ArrayExample72 {

	public static void main(String[] args) {
		String title = "����ǥ";
		String[] head = {"�̸�","����","����","����","����","���"};
		System.out.println(title+"\t");
		
		String[] name = {"����Ÿ","����","���ǿ�","�̽�A"};
		
		String[] head1 = {"�հ�"};
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
package verify;
//매출현황	
//제품명	1월	2월	3월	4월	5월	6월 상반기 합계 평균	
//--------------------------------------------------------------------
//냉장고	250	170	300	780	780	250    
//테레비	170	120	150	220	250	450
//청소기	450	230	400	250	120	230
//--------------------------------------------------------------------
//총계	870	520	850	1250	3490	872.5
//평균	290	173	283	416	1163	290.8
public class Exercise0429 {
	public static void main(String[] args) {
		int sum=0,j=0;
		int[] tot = new int[6];//세로합구하는 배열
		System.out.println("매출현황\t");
		String[] head = {"제품명","1월","2월","3월","4월","5월","6월","합계","평균"};
		String[] name = {"냉장고","테레비","청소기"};
		int[][] amt = {{250,170,300,780,780,250},
				       {170,120,150,220,250,450},
				       {450,230,400,250,120,230}};
			
			for(String h:head)System.out.print(h+"\t");
		System.out.println("\n-----------------------------------------------------------------------");
	    for(int i=0;i<amt.length;i++) {
	    	System.out.print(name[i]+"\t");
	    	for(j=0;j<amt[i].length;j++) {
	    		System.out.print(amt[i][j]+"\t");
	    		sum+=amt[i][j];
	    		tot[j]+=amt[i][j];
	    	}
	    	System.out.println(sum+"\t"+(double)sum/amt[i].length);
	    	sum=0;
	    }
	    System.out.println("---------------------------------------------------------------------------");
	    System.out.print("총계\t");
	    for(j=0;j<tot.length;j++) {
	    	System.out.print(tot[j]+"\t");
	    	sum+=tot[j];
	    }
	    System.out.println(sum+"\t"+(double)sum/tot.length);
	    System.out.print("평균\t");
	    for(j=0;j<tot.length;j++) {
	    	System.out.print(tot[j]/name.length+"\t");
	    }
	    System.out.println(sum/name.length+"\t"+(double)sum/tot.length/name.length);
	
	}

	



	}



package ch08;

public class ArrayExample63 {

	public static void main(String[] args) {
		int[][] no = {{43,465,87},{76,87,32},{32,54,54}};
		for(int i=0;i<no.length;i++) {
			for(int j=0;j<no[i].length;j++) {
				System.out.print(no[i][j]);
				if(j!=no[i].length-1)
					System.out.print(",");
			}
			System.out.println();
		}

	}

}

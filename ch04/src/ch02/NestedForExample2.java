package ch02;
//구구단 세로
public class NestedForExample2 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(j+"x"+i+"="+(i*j)+"\t");//i,j자리 바꾸면 구구단 가로				
			}
			System.out.println();
		}

	}

}

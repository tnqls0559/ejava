package ch02;

public class NestedWhileExample4 {

	public static void main(String[] args) {
		  int i=1;
		  while(i<=9) {
			  int j=2;
			  while(j<=9) {
				  System.out.print(i+"x"+j+"="+(i*j)+"\t");//한줄로 쓰기
				  j++;
			  }
			}
			System.out.println();//한줄 아래로 내리기
			i++;
		}

	}



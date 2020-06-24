package ch02;
//for문을 이용하여 1부터 10까지 덧셈을 표시하고 합을 구하는 문제
public class ForExample6 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;//sum=sum+i;
			System.out.print(i);
			if(i<=9) System.out.print("+");//한줄로 이어서 출력 print();
			else {
				System.out.print("=");
				System.out.println(sum);//출력후 다음 줄로 이동 println();
			}
		}//for문 끝.

	}

}

package verify;
//2와 100사잉의 모든 소수(prime number)를 찾는 프로그램을 작성하시오.
//주어진 수 k를 2부터 k-1까지의 숫자로 나누어서 
//나머지가 0인 것이 하나라도 있으면 소수가 아니다.
public class Exam0427_3_PrimNumber {
	public static void main(String[] args) {
		int count2=0;
		System.out.println("2부터 100사이의 모든 소수:");
		for(int i=2;i<=100;i++) {
			count2=0;
		for(int k=2;k<i;k++) {// k<i : k=i-1
			if((i%k)==0) {
			  count2++;//count2가 0에서 1로 바뀌고
			  break;//연산중단
			}
 		 }	
		//소수 출력
		if(count2==0) System.out.print(" " + i);		
	  }
   }		
}	



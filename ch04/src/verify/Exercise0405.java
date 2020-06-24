package verify;
//5.중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해 구하기
//단, x와y는 10이하의 자연수
public class Exercise0405 {

	public static void main(String[] args) {
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if(4*x+5*y==60) System.out.println("("+x+","+y+")");
			}
		}
	}

}

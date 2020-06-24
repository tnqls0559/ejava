package verify;
//3,6,9 게임
//1부터 100까지의 정수중 3,6,9의 배수가 되는수면 "짝" 
//33 "짝짝"
public class ThreeSixNuneExample2 {

	public static void main(String[] args) {
		String res="";
		for(int i=0;i<=100;i++) {
			if((i/10)%3==0 & (i/10)!=0) res="짝";
			if((i%10)%3==0 & (i%10)!=0) res=res+"짝";
			System.out.println(i+"-"+res);
			res="";//초기화
		}

	}

}

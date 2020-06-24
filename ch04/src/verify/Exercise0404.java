package verify;
//4.while문과 Math.random()매소드를 이용하여 주사위 눈 출력
//두 눈의 합이 5가 나오면 종료
public class Exercise0404 {

	public static void main(String[] args) {
		while(true) {
			//double dice1= Math.random();
			int dice1= (int)(Math.random()*6)+1;//1~6 난수
			int dice2= (int)(Math.random()*6)+1;//1~6난수
			System.out.println("("+dice1+","+dice2+")");
			if(dice1+dice2==5) break;
		}

	}

}

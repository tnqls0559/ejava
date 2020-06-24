package ch02;

public class ForDiceExample1 {

	public static void main(String[] args) {
		int dice1;
		int dice2;
		
		for(;;) {
			dice1=(int)(Math.random()*6)+1;//1~6정수
			dice2=(int)(Math.random()*6)+1;//1~6정수
			if(dice1+dice2==6) break;//반복 블럭 빠져나가는 명령문;
			System.out.println("dice1="+dice1+",dice2"+dice2);
		}
		System.out.println("6이 되는 주사위 눈금:"+dice1+","+dice2);
		

	}

}

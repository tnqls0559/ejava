package ch01;

public class DecreaseOperationExample4 {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);//true
		
		play=!play;// !true -> false
		
		System.out.println(play);
		
		play= !play;//true
		
		while(play) {
			System.out.println("hello");
			System.out.println("계속할까요?");
			char yesNo= 'n';
			if(yesNo=='n') {//'n'=='n'
				play=!play;
			}
		}
		System.out.println("종료");
	}

}

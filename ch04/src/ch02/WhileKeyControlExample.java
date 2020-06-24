package ch02;

public class WhileKeyControlExample {

	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if((keyCode!=13)&&(keyCode!=10)) {
				System.out.println("-------------");
				System.out.println("1.증속 |2.감속 |3.중지");
				System.out.println("-------------");
				System.out.println("선택:");
			}
		  try {
		  keyCode=System.in.read();
		  }catch(Exception e) {System.out.println(e.getMessage());}
		  if(keyCode==49) {//키보드 숫자1
			  speed++;
			  System.out.println("현재속도="+speed);
		  }else if(keyCode==50) {//키보드 숫자2
			  speed--;
			  System.out.println("현재속도="+speed);
		  }else if(keyCode==51) {//키보드 숫자3  
			  run=false;
		  } 
		}//while문 끝.
		System.out.println("프로그램 종료");

	}

}

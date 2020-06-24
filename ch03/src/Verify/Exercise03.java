package Verify;

public class Exercise03 {

	public static void main(String[] args) {
		int score = 85;
		String result = !(score>90)?"가" : "나";//false->true
		System.out.println("result:"+result);
		
		if(score>90) {
			result="가";
		}else {
			result="나";
		}System.out.println("result:"+result);
	}
}


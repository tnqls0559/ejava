package ch02;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper='A';upper<='Z';upper++) {//char
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
			if(lower=='g') break ;//break Outter;=>A-g������ ����
			}
		}
	  System.out.println("���α׷� ����");
}
	}



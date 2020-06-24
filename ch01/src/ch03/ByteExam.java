package ch03;
//byte타입값의 오버플로우
public class ByteExam {
	public static void main(String[] args) {
		byte b=127;
		
		for(int i=0;i<128;i++) {
			System.out.println(b);
			b++;//b=b+1
		}
	}

}

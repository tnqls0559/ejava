package verify;
//3. 1~100������ ������ 3�� ����� ��
public class Exercise0403 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) sum=sum+1;
		}
		System.out.println("3�� ����� ����:"+sum);

	}

}
package verify;
//3,6,9 ����
//1���� 100������ ������ 3,6,9�� ����� �Ǵ¼��� "¦" 
//33 "¦¦"
public class ThreeSixNuneExample {

	public static void main(String[] args) {
		String res="";
		for(int i=0;i<=100;i++) {
			if(i/10==3 || i/10==6 || i/10==9) res="¦";
			if(i%10==3 || i%10==6 || i%10==9) res=res+"¦";
			System.out.println(i+"-"+res);
			res="";//�ʱ�ȭ
		}

	}

}

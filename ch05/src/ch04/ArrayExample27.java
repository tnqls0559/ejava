package ch04;
//String Ÿ���� �����͸� ������ �� �ִ� ���̰� 5�� �迭�� �����
//�迭�� index ��ȣ�� ¦����°��(index��ȣ�� 0,2,4) ��ҿ� ���� "hello", "hi","hey"��
//�Է��ϰ� ������ ����ϼ���.
public class ArrayExample27 {

	public static void main(String[] args) {
		//String[] stringArray = new String [5];
		//System.out.println(stringArray[0]);
		//stringArray[0]="hello";
		//stringArray[2]=new String("hi");
		//String str="hey";
		//stringArray[4]=str;
		String[] stringArray = {"hello",null,"hi",null,"hey"};
		
		//int i=0;
		for(int i=0;i<stringArray.length;i+=2) {
			System.out.println(stringArray[i]);
		}
		//System.out.println(stringArray[i]);
		//System.out.println(stringArray[i+=2]);
		//System.out.println(stringArray[i+=2]);
		
		}
		

	}



package ch02;

public class CheckOverFlowExample {
   public static void main(String[] args) {
	   try {
	   int result = safeAdd(2000000000,2000000000);
	   System.out.println(result);
	   }catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	}
   //   Integer.MIN_VALUE <= left + right���� ���� <=Integer.MAX_VALUE
   //���������� ������� ����Ÿ�� �޼ҵ��(�ް�����){���ɹ�;}
    public static int safeAdd(int left,int right) {
    	if(right>0) {
    		if(left>(Integer.MAX_VALUE-right)) {
    			throw new ArithmeticException("�����÷ο� �߻�");
    		}
    	}else {//right<=0
    		if(left<(Integer.MIN_VALUE-right)) {
    			throw new ArithmeticException("�����÷ο� �߻�");
    		}
    	}//if~else ��.
    	return left+right;
    	}
    }

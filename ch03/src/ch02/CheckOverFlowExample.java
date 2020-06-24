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
   //   Integer.MIN_VALUE <= left + right값의 범위 <=Integer.MAX_VALUE
   //접근제한자 생성장소 리턴타입 메소드명(메개변수){명령문;}
    public static int safeAdd(int left,int right) {
    	if(right>0) {
    		if(left>(Integer.MAX_VALUE-right)) {
    			throw new ArithmeticException("오버플로우 발생");
    		}
    	}else {//right<=0
    		if(left<(Integer.MIN_VALUE-right)) {
    			throw new ArithmeticException("오버플로우 발샐");
    		}
    	}//if~else 끝.
    	return left+right;
    	}
    }


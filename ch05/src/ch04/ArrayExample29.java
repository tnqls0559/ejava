package ch04;
//double타입 값을 5개 저장하는 배열을 만들고 
//10.5, 20.3, 30.6, 40.5, 45.9
//를 저장하고 값의 합과 평균을 출력하시오.
public class ArrayExample29 {
	public static void main(String[] args) {
		double[] doubleArr = new double[5];		
		doubleArr[0]=10.5;
		doubleArr[1]=20.3;
		doubleArr[2]=30.6;
		doubleArr[3]=40.5;
		doubleArr[4]=45.9;
		
		//double[] doubleArr = {10.5,20.3,30.6,40.5,45.9};
		
		double sum=0;
		sum=sum+doubleArr[0];
		sum=sum+doubleArr[1];
		sum=sum+doubleArr[2];
		sum=sum+doubleArr[3];
		sum=sum+doubleArr[4];
		
	
		for(int i=0;i<doubleArr.length;i++) {//length : 5,i:0,1,2,3,4
			System.out.println("합:"+sum);
			System.out.println("평균:"+sum/5);break;
	
		//for(int i=0;i<doubleArr.length;i++)
			//sum=sum+doublrArr[i];
			
		//System.out.println(sum);
		//System.out.println(sum/doubleArr.length);
		
		
}
	}
}

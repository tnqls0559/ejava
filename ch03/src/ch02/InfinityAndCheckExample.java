package ch02;

public class InfinityAndCheckExample {

	public static void main(String[] args) {
		int x=5;
		double y=0.0;
		
		double z=x/y;
		//  z=x%y;
		
		//Wrapper≈¨∑°Ω∫ Double
		System.out.println(Double.isInfinite(z));//Infinity
		System.out.println(Double.isNaN(z));
		
		System.out.println(z+2);//Infinity + 2		

	}

}

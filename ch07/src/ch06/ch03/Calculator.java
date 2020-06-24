package ch06.ch03;

public abstract class Calculator {
	//추상메소드 : 메소드명(매개변수);
	public abstract int add(int a,int b);
	public abstract int subtract(int a,int b);
	public abstract double average(int[] a);
	
	public static void main(String[]args) {
		Calculator c = new GoodCalculator();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
}
class GoodCalculator extends Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return (double)sum/a.length;
	}
}
package Verify;

public class Exercise {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=(++x)+(y--);//¿¬»ê½Ä, z=11 + 20
		System.out.println(z);//31
		System.out.println(x);//11
		System.out.println(y);//19
	}
}



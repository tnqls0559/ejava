package ch02;

public class AccountMainExample {
	public static void main(String[]args) {
		Account acc1 = new Account("È«±æµ¿",10000);
		acc1.getBalance();
		//ÀÔ±Ý
		acc1.deposit(2000);
		acc1.getBalance();
		//Ãâ±Ý
		acc1.withDraw(13000, "È«±æµ¿");
		acc1.getBalance();
		acc1.withDraw(8000, "ÀÓ²©Á¤");
		acc1.getBalance();
		acc1.withDraw(8000, "È«±æµ¿");
		acc1.getBalance();
	}

}

package verify.ch18;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		System.out.println((obj1==obj2?"같은":"다른")+"ShopService객체입니다.");

	}

}

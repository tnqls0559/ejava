package ch05.ch08;

public class Fruit extends Object{
	//필드
		private String kind;
		private int price;
		private Brix brix;
		private int sale;
		
		//생성자 3개짜리
		public Fruit(String kind, int price, Brix brix) {
			this.kind = kind;
			this.price = price;
			this.brix = brix;
		}
		@Override
		public String toString() {
		return "Fruit [kind=" + kind + ", price=" + price + ", "
				+ "brix=" + brix + ", sale=" + sale +",total="+price*sale+"]";
		}
		
		public String getKind() {return kind;}
		public void setKind(String kind) {
			this.kind = kind;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public Brix getBrix() {
			return brix;
		}
		public void setBrix(Brix brix) {
			this.brix = brix;
		}
		public int getSale() {
			return sale;
		}
		public void setSale(int sale) {
			this.sale = sale;
		}
}		

		



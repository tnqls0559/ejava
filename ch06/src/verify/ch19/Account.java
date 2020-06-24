package verify.ch19;

public class Account {
	//필드
	final int MIN_BALANCE=0;
	final int MAX_BALANCE=1000000;
   private int balance;
   //생성자
   public Account() {}
 
   //메소드
   public int getBalance() {
	  return balance;
   }
   public void setBalance(int balance) {
	  if(balance>=MIN_BALANCE & balance<=MAX_BALANCE)
	  this.balance = balance;
   }
  }

package verify.ch20;

public class Account {
	//�ʵ�
	private String ano;//���¹�ȣ
	private String owner;//������
	private int balance;//�ܰ�
	private int pwd;
	//������
	public Account(String ano, String owner,int pwd, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.pwd = pwd;
		this.balance = balance;
	}
	//�޼ҵ�
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public int getBalance() {
		return balance; 
	}
	public void setBalance(int balance) {
		if(this.balance + balance > 0)//10000 +(-50000)
		this.balance += balance;
	}
	//toStirng()
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", pwd=" + pwd +",balance=" + balance + "]";
	}
	

}

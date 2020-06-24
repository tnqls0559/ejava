package verify.ch20;

import java.util.Scanner;

public class BankApplication {
	private static int ANO_No=111;
	private static int seq;
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		boolean run= true;
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4.��� | 5.��ü| 6.Ż��| 7����" );
			System.out.println("-------------------------------------------------------");
			System.out.println("����>");
			
			int selectNo= scanner.nextInt();
			switch(selectNo) {
			case 1:creatAccount(); break;
			case 2:accountList(); break;
			case 3:deposit(); break;
			case 4:withdraw(); break;
			case 5:transfer(); break;
			case 6:secession(); break;
			default: run= false;

	       }
		
	  }//while �� ��.
		System.out.println("���α׷� ����");
		scanner.close();
   }//main () �޼ҵ� ��.	

	
	//���»����ϱ�
	private static void creatAccount() {
		System.out.println("-----");
		System.out.println("���»���");
	    System.out.println("-----");
		//System.out.println("���¹�ȣ:");
		//String ano=scanner.next();
		System.out.println("������:");
		String owner=scanner.next();
		System.out.println("��й�ȣ �Է�:");
		int pwd = scanner.nextInt();
		System.out.println("�ʱ��Աݾ�:");
		int balance = scanner.nextInt();
		Account account = new Account(ANO_No+"-"+(++seq)+seq+seq,owner ,pwd , balance);
		//System.out.println(account);
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=account;
			    break;
	     	}
	    }				
	}
	//���¸�Ϻ���
	private static void accountList() {
		for(int i=0; i<accountArray.length;i++)
			if(accountArray[i]!=null)
			System.out.println(accountArray[i]);
	
	}
	//�����ϱ�(���¹�ȣ�� �´� ��ü�� ã�� ������ �־���Ѵ�.) 
	private static void deposit() {
		System.out.println("--------------------");
		System.out.println("����");
		System.out.println("--------------------");
		System.out.println("���¹�ȣ:");
		String ano= scanner.next();
		System.out.println("�Աݾ�:");
		int balance = scanner.nextInt();
		Account account = findAcount(ano);
		account.setBalance(+balance);
		System.out.println("���: �Ա��� �����Ǿ����ϴ�.");
		
	}
	//����ϱ�
	private static void withdraw() {
		System.out.println("--------------------");
		System.out.println("���");
		System.out.println("--------------------");
		System.out.println("���¹�ȣ:");
		String ano= scanner.next();
		System.out.println("��ݾ�:");		
		int balance = scanner.nextInt();
		System.out.println("��й�ȣ �Է�:");
		int pwd = scanner.nextInt();
		Account account = findAcount(ano);
		 for(int i=0;i<accountArray.length;i++) {
			  if(accountArray[i] == findAcount(ano)){	
				    
				    account.setBalance(-balance);
				  System.out.println("���: ����� �����Ǿ����ϴ�.");
		             break;
			  }else {   
			     System.out.println("��й�ȣ�� �ٸ��ϴ�.");
				 System.out.println("�ٽ� �Է����ּ���.");
				 return;
				 
			  }
		 }
	}
	//������ü
	private static void transfer() {
		
		System.out.println("��ü");
		System.out.println("��ݰ��¹�ȣ�� �Է��ϼ���>");
		String ano= scanner.next();
		System.out.println("�����¹�ȣ�� �Է��ϼ���>");           
		String ano1= scanner.next();
		System.out.println("��ü�ݾ��� �Է��ϼ���>");
		int balance = scanner.nextInt();
		
		 Account account = findAcount(ano);
         Account account1 = findAcount(ano1);
		
	  if(account.getBalance()-balance>=0);{
		account.setBalance(-balance);
					
		System.out.println("���: ��ü�� �����Ǿ����ϴ�.");			
	  account1.setBalance(+balance);	
	  }
	}

	//ȸ��Ż��
	private static void secession() {
		System.out.println("Ż��");
		System.out.println("Ż���� ���¹�ȣ�� �Է��ϼ���>");
		String ano= scanner.next();
		System.out.println("���� Ż���Ͻðڽ��ϱ�?(y/n)");
		String ans = scanner.next();
		
	   if(ans.equals("y") ||ans.equals("Y")) {
		   for(int i=0;i<accountArray.length;i++) {
			  if(accountArray[i] == findAcount(ano)){
			   accountArray[i]=null;
			   break;
	    
	          }else {
	        	  System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
	        	  System.out.println("���¹�ȣ�� �ٽ� �Է����ּ���.>"); 
	        	  ano= scanner.next();
	          }			 
	      } System.out.println("���: Ż�� ó���� �Ϸ�Ǿ����ϴ�."); 
	   }else {
	    	System.out.println("���: Ż�� ó���� ��ҵǾ����ϴ�."); 
	   }
	}
	   
	
	//Account�迭���� ano�� ������ Account ��ü ã��
	private static Account findAcount(String ano) {
		Account account=null;//�޼ҵ� �ȿ� ����� ���ú��� 
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {
					account=accountArray[i];
					break;
				}
				
			}
		}return account;
	}
	
	}

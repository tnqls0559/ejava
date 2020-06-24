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
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5.이체| 6.탈퇴| 7종료" );
			System.out.println("-------------------------------------------------------");
			System.out.println("선택>");
			
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
		
	  }//while 문 끝.
		System.out.println("프로그램 종료");
		scanner.close();
   }//main () 메소드 끝.	

	
	//계좌생성하기
	private static void creatAccount() {
		System.out.println("-----");
		System.out.println("계좌생성");
	    System.out.println("-----");
		//System.out.println("계좌번호:");
		//String ano=scanner.next();
		System.out.println("계좌주:");
		String owner=scanner.next();
		System.out.println("비밀번호 입력:");
		int pwd = scanner.nextInt();
		System.out.println("초기입금액:");
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
	//계좌목록보기
	private static void accountList() {
		for(int i=0; i<accountArray.length;i++)
			if(accountArray[i]!=null)
			System.out.println(accountArray[i]);
	
	}
	//예금하기(계좌번호에 맞는 객체를 찾는 로직이 있어야한다.) 
	private static void deposit() {
		System.out.println("--------------------");
		System.out.println("예금");
		System.out.println("--------------------");
		System.out.println("계좌번호:");
		String ano= scanner.next();
		System.out.println("입금액:");
		int balance = scanner.nextInt();
		Account account = findAcount(ano);
		account.setBalance(+balance);
		System.out.println("결과: 입급이 성공되었습니다.");
		
	}
	//출금하기
	private static void withdraw() {
		System.out.println("--------------------");
		System.out.println("출금");
		System.out.println("--------------------");
		System.out.println("계좌번호:");
		String ano= scanner.next();
		System.out.println("출금액:");		
		int balance = scanner.nextInt();
		System.out.println("비밀번호 입력:");
		int pwd = scanner.nextInt();
		Account account = findAcount(ano);
		 for(int i=0;i<accountArray.length;i++) {
			  if(accountArray[i] == findAcount(ano)){	
				    
				    account.setBalance(-balance);
				  System.out.println("결과: 출금이 성공되었습니다.");
		             break;
			  }else {   
			     System.out.println("비밀번호가 다릅니다.");
				 System.out.println("다시 입력해주세요.");
				 return;
				 
			  }
		 }
	}
	//계좌이체
	private static void transfer() {
		
		System.out.println("이체");
		System.out.println("출금계좌번호를 입력하세요>");
		String ano= scanner.next();
		System.out.println("상대계좌번호를 입력하세요>");           
		String ano1= scanner.next();
		System.out.println("이체금액을 입력하세요>");
		int balance = scanner.nextInt();
		
		 Account account = findAcount(ano);
         Account account1 = findAcount(ano1);
		
	  if(account.getBalance()-balance>=0);{
		account.setBalance(-balance);
					
		System.out.println("결과: 이체가 성공되었습니다.");			
	  account1.setBalance(+balance);	
	  }
	}

	//회원탈퇴
	private static void secession() {
		System.out.println("탈퇴");
		System.out.println("탈퇴할 계좌번호를 입력하세요>");
		String ano= scanner.next();
		System.out.println("정말 탈퇴하시겠습니까?(y/n)");
		String ans = scanner.next();
		
	   if(ans.equals("y") ||ans.equals("Y")) {
		   for(int i=0;i<accountArray.length;i++) {
			  if(accountArray[i] == findAcount(ano)){
			   accountArray[i]=null;
			   break;
	    
	          }else {
	        	  System.out.println("계좌번호가 존재하지 않습니다.");
	        	  System.out.println("계좌번호를 다시 입력해주세요.>"); 
	        	  ano= scanner.next();
	          }			 
	      } System.out.println("결과: 탈퇴 처리가 완료되었습니다."); 
	   }else {
	    	System.out.println("결과: 탈퇴 처리가 취소되었습니다."); 
	   }
	}
	   
	
	//Account배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAcount(String ano) {
		Account account=null;//메소드 안에 선언된 로컬변수 
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

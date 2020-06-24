package ch01;
public class Test1{
	public static void main(String[] args){
	char a = '\uD64D';
	char b = '\uAE38';
	char c = '\uB3D9';
	
	System.out.println(""+a+b+c);//""+'\uD64D' =>"È¦","È«"+'\uAE38'="È«±æ",
	System.out.println(10+20);
	System.out.println(""+10+20);//""+10=>"10", "10"+20=> "1020"
	System.out.println(b);
	System.out.println(c);
}
	
}	



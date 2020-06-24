package ch06;

public class StudentMainExample {

	public static void main(String[] args) {
		Student student = new Student();
		Person person = student.getPerson("ȫ�浿",'M',13);
		
		System.out.println(person.name+","+person.Gender+","+person.age);

	}

}

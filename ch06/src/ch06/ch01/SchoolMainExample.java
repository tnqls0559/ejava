package ch06.ch01;

public class SchoolMainExample {

	public static void main(String[] args) {
		School school = new School();
		Student student = school.getStudent(1, "ȫ�浿", 70, 80, 90);
        school.scoreInfo(student);
	}

}

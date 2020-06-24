package Verify;

public class Exercise04 {

	public static void main(String[] args) {
		int pencils=534;
		int students=30;
		
		int pencilsPerStudent = pencils/students;
		int pencilsLeft = pencils%students;
		
		System.out.println("한 학생당:"+pencilsPerStudent+"개");
		System.out.println("나머지"+pencilsLeft+"개");
}
}	



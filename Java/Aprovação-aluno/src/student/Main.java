package student;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		System.out.println("TYPE THREE NOTES: ");
		st.note1 = sc.nextDouble();
		st.note2 = sc.nextDouble();
		st.note3 = sc.nextDouble();
		System.out.println("FINAL GRADE: "+st.finalGrade());
		
		st.missingPoint();
		
		
	 sc.close();
	}
}
